package Questions;

import java.util.Scanner;

public class feverornot {
    public static void main ( String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your temperature: ");
        float temp = sc.nextFloat();

        if ( temp <= 34 ) {
            System.out.println(temp +"^oC You are fine");
        } else if ( temp >= 35 && temp <= 37 ) {
            System.out.println(temp + "^oC mild fever");
        } else {
            System.out.println(temp + "^oC high fever");
        }
    }
}
