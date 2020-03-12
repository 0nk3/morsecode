import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String plainTextSentence = " Hi There";
//        String morseCodeSentence = ".... .. / - .... . .-. . ";

        String plainTextSentence;
        String morseCodeSentence;
        String option;
        // object creation
        Scanner input = new Scanner(System.in);
        MorseCode morseCode = new MorseCode();
        // user options
        System.out.println("***********************************************************  *");
        System.out.println("*               SELECT 1 or 2                                *");
        System.out.println("*        0. quit                                             *");
        System.out.println("*        1. From Plain Text To Morse Code                    * ");
        System.out.println("*        2. From Morse Code To Plain                         *");
        System.out.println("************************************************************ *");


        // processing
        do {
            System.out.println("SELECT(0 or 1 or 2) : ");
            option = input.nextLine();

            switch (option) {
                case "1" :
                    System.out.println("Enter plain text : ");
                    plainTextSentence = input.nextLine();
                    morseCode.lettersToMorseCode(plainTextSentence);
                    break;
                case "2" :
                    System.out.println("Enter morse code : ");
                    morseCodeSentence = input.nextLine();
                    morseCode.morseCodeToLetters(morseCodeSentence);
                    break;
            }
            System.out.println();
        }while (!option.equals("0"));
        System.out.println("<========================== Goodbye ====================================> ");

    }
}
