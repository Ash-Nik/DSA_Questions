package Assignment_on_loops;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size  = ");
        int x = sc.nextInt();
        for(int i = 0;i<x;i++){
            for (int j = 0;j<x;j++){
                if(i==x/2){
                    System.out.print("*");
                }
               else if(j==x/2){
                    System.out.print("*");
                }
               else {
                    System.out.print(" ");
                }

            }
        }
        System.out.println();

    }
}
