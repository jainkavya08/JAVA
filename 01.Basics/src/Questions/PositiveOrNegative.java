package Questions;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main (String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ( num > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
    }
}
