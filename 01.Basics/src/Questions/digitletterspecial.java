package Questions;

import java.util.Scanner;

public class digitletterspecial {
    public static void main (String [] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your character: ");
        char ch = sc.next().charAt(0);

        if ( ch >= 'a' && ch <= 'z' ) {
            System.out.println("letter");
        } else if ( ch >= '0' && ch <= '9' ) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Symbol");
        }
    }
}
