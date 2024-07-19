package Assignment1;

import java.util.Scanner;
public class Assignment1_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x = ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y = ");
        int y = sc.nextInt();
        int product = x*y;
        System.out.println("The product of "+x+ " and "+y+" is = "+product);

    }
}
