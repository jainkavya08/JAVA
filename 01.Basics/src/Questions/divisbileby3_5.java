package Questions;

import java.util.Scanner;

public class divisbileby3_5 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if ( num % 3 == 0 && num % 5 == 0) {
            System.out.println("Number is divisible by both 3 & 5");
        } else {
            System.out.println("Not divisible");
        }

    }
}
