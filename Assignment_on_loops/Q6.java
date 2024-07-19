package Assignment_on_loops;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows = ");
        char x = 65;
        int rows =sc.nextInt();
            for (int i = 1;i<=rows;i++){
                for (int j = rows-i;j>=1;j--){
                    System.out.print(" ");
                }
                for (int k = 1;k<=(2*i)-1;k++){
                    System.out.print(x++);
                }
                x=65;
                System.out.println();
            }
            char y = 65;
            for(int l = 1;l<=rows-1;l++){
                for (int j = 1;j<=l;j++){
                    System.out.print(" ");
                }
                for(int m =(rows-l)*2-1 ;m>=1;m--){
                    System.out.print(y++);
                }
                y=65;
                System.out.println();
            }
        }

    }
