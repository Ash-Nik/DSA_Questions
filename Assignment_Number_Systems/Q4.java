package Assignment_Number_Systems;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number = ");
        int d = sc.nextInt();
        System.out.println("Enter the binary number = ");
        int x = sc.nextInt();
        int c = 0;
        int sum = 0;
        while (x!=0){
            int z = x%10;
            sum=sum+z*(int)Math.pow(2,c);
            c++;
            x=x/10;
        }
        System.out.println(sum*d);
    }
    }

