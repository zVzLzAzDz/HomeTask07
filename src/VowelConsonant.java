import java.util.Scanner;

public class VowelConsonant {

    public static char inputLetter() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input letter: ");

        char input = '*';

        input = scanner.next().charAt(0);

        input = Character.toUpperCase(input);

        input = Character.toLowerCase(input);

        if (input >= 'a' && input <= 'z') {

            switch (input) {
                case 'a': {
                }
                case 'o': {
                }
                case 'i': {
                }
                case 'e': {
                }
                case 'u': {
                }
                System.out.println(input + " vowels");
                break;
                default: {
                    System.out.println(input + " consonant");
                }

            }

        }
        return input;
    }

    public static void main(String[] args) {

        char result = inputLetter();

    }
}


