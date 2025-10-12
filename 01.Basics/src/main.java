// Taking input in  java

import java.util.Scanner;

public class main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number a: ");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("a = " + a);
        System.out.println("My name is : " + name);
    }
}