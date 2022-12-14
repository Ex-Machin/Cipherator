package com.project.cipherator;
import java.util.Scanner;
import java.lang.reflect.Field;


class Test {
        public static void main(String[] args) throws Exception {
            CipheratorEncoderKey cipheratorEncoderKey = new CipheratorEncoderKey();
            CipheratorDecoderKey cipheratorDecoderKey = new CipheratorDecoderKey();
            boolean exit = false;

            while(exit == false) {

            Scanner scanChoice = new Scanner(System.in);
            System.out.println("");
            System.out.println("Co chcesz zrobić? Wybierz jedną z opcji: ");
            System.out.println("1. Zaszyfrowanie");
            System.out.println("2. Odszyfrowanie");
            System.out.println("3. Wyjscie");

            String choice= scanChoice.nextLine();

            System.out.println("Wybrano opcję: "+ choice + " zatem ");

            if (choice.equals("1")) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Wprowadz co, chcesz zasyfrować");

                String stringToEncode = scan.nextLine();


                //Encoding
                for (int i = 0; i < stringToEncode.length(); i++) {
                    char currentChar = stringToEncode.charAt(i);
                    if (currentChar == ' ') {
                        System.out.print(" ");
                        continue;
                    }
                    try {
                        Class cls = cipheratorEncoderKey.getClass();
                        Field field = cls.getDeclaredField(String.valueOf(currentChar));

                        System.out.print(field.get(cipheratorEncoderKey));

                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                }
            }
            else if (choice.equals("2")) {
                Scanner scan = new Scanner(System.in);
                System.out.println("");
                System.out.println("Wprowadz co, chcesz decodować");

                String stringToDecode = scan.nextLine();

                //Decoding

                for (int i = 0; i < stringToDecode.length(); i++) {
                    char currentChar = stringToDecode.charAt(i);
                    if (currentChar == ' ') {
                        System.out.print(" ");
                        continue;
                    }
                    try {
                        Class cls = cipheratorDecoderKey.getClass();
                        Field field = cls.getDeclaredField(String.valueOf(currentChar));



                        System.out.print(field.get(cipheratorDecoderKey));

                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                }
            }
            else if (choice.equals("3")) {
                exit = true;
            }
            else {
                System.out.println("Błędny wybór");
            }
        }
        }
}