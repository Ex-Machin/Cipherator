package com.project.cipherator;
import java.util.Scanner;
import java.lang.reflect.Field;


class Test {
        public static void main(String[] args) throws Exception {
            CipheratorEncoderKey cipheratorEncoderKey = new CipheratorEncoderKey();
            CipheratorDecoderKey cipheratorDecoderKey = new CipheratorDecoderKey();


            Scanner scan = new Scanner(System.in);
            System.out.println("Wprowadz co, chcesz zasyfrować");

            String stringToEncode = scan.nextLine();

            //Encoding
            for (int i = 0; i < stringToEncode.length(); i++) {
                char currentChar = stringToEncode.charAt(i);

                try {
                    Class cls = cipheratorEncoderKey.getClass();
                    Field field = cls.getDeclaredField(String.valueOf(currentChar));

                    System.out.print(field.get(cipheratorEncoderKey));

                } catch(Exception e) {
                    System.out.println(e.toString());
                }
            }
            System.out.println("");
            System.out.println("Wprowadz co, chcesz decodować");

            String stringToDecode = scan.nextLine();

            //Decoding

            for (int i = 0; i < stringToDecode.length(); i++) {
                char currentChar = stringToDecode.charAt(i);

                try {
                    Class cls = cipheratorDecoderKey.getClass();
                    Field field = cls.getDeclaredField(String.valueOf(currentChar));

                    System.out.print(field.get(cipheratorDecoderKey));

                } catch(Exception e) {
                    System.out.println(e.toString());
                }
            }
        }
}