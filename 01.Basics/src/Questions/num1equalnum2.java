package Questions;

import java.util.Scanner;

public class num1equalnum2 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number 1 : ");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter a number 2: ");
        int num2 = sc.nextInt();

        if (num1 == num2 ) {
            System.out.println("Equal Numbers");
        } else {
            System.out.println("Not equal Numbers");
        }
    }
}
