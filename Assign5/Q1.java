package Assign5;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the sum of digit :");
        int x = sc.nextInt();
        int sum=0;
        while(x!=0){
            int z = x%10;
            sum=sum+z;
            x=x/10;
        }
        System.out.println("The sum of n numbers = "+sum);
    }
}
