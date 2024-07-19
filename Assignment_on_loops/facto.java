//Write a program to calculate the factorial of a number.
package Assignment_on_loops;

import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();
        int facto = 1;
        for(int i = 1;i<=n;i++){
            facto=facto*i;
        }
        System.out.println("Factorial = "+facto);
    }
}
