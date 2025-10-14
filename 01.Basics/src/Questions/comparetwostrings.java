package Questions;

import java.util.Scanner;

public class comparetwostrings {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string 1: ");
        String str_one = sc.nextLine();

        System.out.println("Enter your string 2: ");
        String str_two = sc.nextLine();

        if (str_one.equals(str_two)) {
            System.out.println("Equal Strings");
        } else {
            System.out.println("Different Strings");
        }
    }
}
