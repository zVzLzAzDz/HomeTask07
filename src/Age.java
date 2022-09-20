import java.util.Scanner;

public class Age {

    public static int InputYears(int num) {

        num = num < 0 ? -num : num;

        if (num > 120){
            System.out.println("You have entered incorrect data!!!");
        }
        else if (num == 11 || num == 111 || num == 112 || num == 113 || num == 114) {
            System.out.println(num + " лет");
        } else if (num % 10 == 1) {
            System.out.println(num + " год");
        } else if (num % 10 == 2 || num % 10 == 3 || num % 10 == 4) {
            System.out.println(num + " года");
        } else {
            System.out.println(num + " лет");

        }
        return num;
    }

    public static void main(String[] args) {

        System.out.print("Input years: ");

        Scanner vlad = new Scanner(System.in);

        int num = vlad.nextInt();

        int Years = InputYears(num);

    }
}