package com.project.cipherator;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Field;

public class Cipherator {
    String A = "m";
    String B = "b";
    String b = "v";
    String C = "c";
    String Ć = "x";
    String D = "z";
    String E = "a";
    String Ę = "s";
    String F = "d";
    String G = "f";
    String H = "g";
    String I = "h";
    String J = "j";
    String K = "k";
    String L = "l";
    String Ł = "p";
    String M = "o";
    String N = "i";
    String Ń = "u";
    String O = "y";
    String Ó = "t";
    String P = "r";
    String Q = "e";
    String R = "w";
    String S = "q";
    String Ś = "ł";
    String T = "ś";
    String U = "ę";
    String V = "ó";
    String W = "ń";
    String X = "1";
    String Y = "2";
    String Z = "3";
    String Ź = "4";
    String Ż = "5";
    String c = "Q";
    String ć = "A";
    String d = "Z";
    String e = "W";
    String ę = "S";
    String f = "X";
    String g = "E";
    String h = "D";
    String i = "C";
    String j = "R";
    String k = "F";
    String l = "V";
    String ł = "T";
    String m = "G";
    String n = "B";
    String ń = "Y";
    String o = "H";
    String ó = "N";
    String p = "Y";
    String q = "H";
    String r = "N";
    String s = "U";
    String ś = "J";
    String t = "M";
    String u = "I";
    String v = "K";
    String w = "M";
    String x = "O";
    String y = "L";
    String z = "P";
    String ź = "Ł";
    String ż = "Ń";
}

class Test {
        public static void main(String[] args) throws Exception {
            Cipherator cipherator = new Cipherator();

            Scanner scan = new Scanner(System.in);
            System.out.println("Wprowadz co, chcesz zasyfrować");

            String stringToEncode = scan.nextLine();


            //Encoding
            for (int i = 0; i < stringToEncode.length(); i++) {
                char currentChar = stringToEncode.charAt(i);

                try {
                    Class cls = cipherator.getClass();
                    Field field = cls.getDeclaredField(String.valueOf(currentChar));

                    System.out.print(field.get(cipherator));

                } catch(Exception e) {
                    System.out.println(e.toString());
                }
            }
        }
}