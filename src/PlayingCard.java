import java.util.Scanner;

public class PlayingCard {

    public static String displayPlayingCard(int num1, int num2) {

        Scanner vlad = new Scanner(System.in);

        System.out.print("Input number from 1 to 4(Card suit): ");
        num1 = vlad.nextInt();

        System.out.print("Input number from 6 to 14(The dignity of the card): ");
        num2 = vlad.nextInt();


        num1 = num1 < 0 ? -num1 : num1;
        num2 = num2 < 0 ? -num2 : num2;

        String name = " ";

        switch (num1) {
            case 1:
                name = "PIKA";
                break;
            case 2:
                name = "TREFA";
                break;
            case 3:
                name = "BYBNA";
                break;
            case 4:
                name = "CHERVA";
                break;
            default:
                name = "You have entered incorrect data";
                break;

        }

        switch (num2) {
            case 6:
                name = name + " SIX";
                break;
            case 7:
                name = name + " SEVEN";
                break;
            case 8:
                name = name + " EIGHT";
                break;
            case 9:
                name = name + " NINE";
                break;
            case 10:
                name = name + " TEN";
                break;
            case 11:
                name = name + " JACK";
                break;
            case 12:
                name = name + " QUEEN";
                break;
            case 13:
                name = name + " KING";
                break;
            case 14:
                name = name + " ACE";
                break;
            default:
                name = "You have entered incorrect data";
                break;
        }  // final operation switch

        return name;
    }


    public static void main(String[] args) {

        String result = displayPlayingCard(0, 0);

        System.out.println(result);
    }
}