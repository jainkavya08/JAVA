package Questions;

import java.util.Scanner;

public class Passedorfailed {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        if ( marks >= 40 ) {
            System.out.println("Passed");
        } else {
            System.out.println("failed");
        }
    }
}
