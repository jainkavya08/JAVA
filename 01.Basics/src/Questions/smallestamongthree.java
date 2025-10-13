package Questions;

import java.util.Scanner;

public class smallestamongthree {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter number 3: ");
        int num3 = sc.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("Smallest number is: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Smallest number is: " + num2);
        } else {
            System.out.println("Smallest number is: " + num3);
        }
    }
}
