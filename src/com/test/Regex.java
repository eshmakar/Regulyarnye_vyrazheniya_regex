package com.test;
import java.util.Arrays;
public class Regex {
            public static void main(String[] a){
                String s = "12345 ksooe ";
                String s2 = "-10483 ";
                String s3 = "+12345 ";
                String s4= "hello ";
                String s5 = "=<|>&>+";
                String all = s + s2 + s3 + s4 + s5;
                System.out.println(all);


                //("-?\\d+") — знаки -? означают, что может содержать в себе знак минус, а может и не содержать, \\d — означает, что здесь может быть любая однозначная цифра, + означает что могут быть большо одной цифры
                System.out.println(s2.matches("-?\\d+"));
                System.out.println(s.substring(0, 4).matches("-?\\d+"));
                System.out.println(s3.matches("(-|\\+)?\\d+"));// (-|\\+) — чтобы искать цифры независимо с минусом или с плюсом, знак | означает ИЛИ
                System.out.println(s4.matches("\\w+"));
                System.out.println(s5.matches("\\W+"));

                System.out.println(Arrays.toString(all.split("\\+")));
            }
        }
	/*
	РЕГУЛЯРНЫЕ ВЫРАЖЕНИЯ:
	\\d — любая цифра
	\\w — символ слова
	\\W — символ, не являющийся символом слово
	String regex=”\\d{3}”; // шаблон строки из трех цифровых символов;
Для экранирования любых из этих символов [ ] | ^ $ . \ ? * + ( ) используется \\
	Для поиска точных значении слово можно помещать внутрь Q....E, например \\Q1+1=2\\E (для поиска 1+1=2)

	*/
