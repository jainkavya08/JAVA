package Questions;

import java.util.Scanner;

public class yeariscentury {
    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if ( year % 100 == 0) {
            System.out.println("Is a century");
        } else {
            System.out.println("Not a century");
        }
    }
}
