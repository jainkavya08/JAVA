package Questions;

import java.util.Scanner;

public class passwordchecking {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String sys_pass = "kj@080605";

        System.out.println("Enter password: ");
        String user_pass = sc.nextLine();

        if ( user_pass.equals(sys_pass)) {
            System.out.println("Correct Password");
        } else {
            System.out.println("Incorrect Password Pls Try again");
        }

    }
}
