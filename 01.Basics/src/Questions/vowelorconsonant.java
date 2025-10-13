package Questions;

import java.util.Scanner;

public class vowelorconsonant {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char ch = sc.next().charAt(0);

        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
            System.out.println("It is a vowel");
        } else if ( ch >= 'a' && ch <= 'z') {
            System.out.println("not a vowel");
        } else {
            System.out.println("Invalid input");
        }
    }
}
