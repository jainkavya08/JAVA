package Questions;

import java.util.Scanner;

public class largestBetweentwonum {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("number 1 is the largest");
        } else {
            System.out.println("number 2 is the largest");
        }
    }
}
