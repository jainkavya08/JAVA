package Questions;

import java.util.Scanner;

public class odddivisibleby7 {
    public static void main (String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if ( num % 2 != 0 && num % 7 ==0) {
            System.out.println("is odd and divisible by 7");
        } else {
            System.out.println("Is not valid");
        }
    }
}
