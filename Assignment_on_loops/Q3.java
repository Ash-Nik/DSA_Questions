package Assignment_on_loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number = ");
        int x = sc.nextInt();
        int c = 1;
        for (int i = 1;i<=x;i++){
            c=c*i;
        }
        System.out.println("The factorial of the number = "+c);
    }
}
