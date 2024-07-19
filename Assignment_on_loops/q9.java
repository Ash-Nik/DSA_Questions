package Assignment_on_loops;
//Q9- Write a program to check whether a prime Number can be expressed as a Sum of Two
//        Prime Numbers.
//        Input1:
//        13
//        Output1:
//        True
//        Input2:
//        2
//        Output2:
//        False

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is prime or not = ");
        int x = sc.nextInt();
        for (int i = 2;i<=x;i++){
            if(x%i==0){
                System.out.println("not prime ");
            }
        }
    }
}
