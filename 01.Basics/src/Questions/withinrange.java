package Questions;

import java.util.Scanner;

public class withinrange {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if ( num >= 10 && num <= 50 ) {
            System.out.println(" within the range");
        } else {
            System.out.println("Outside the range ");
        }
    }
}
