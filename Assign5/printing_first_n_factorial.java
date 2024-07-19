package Assign5;
import java.util.Scanner;
public class printing_first_n_factorial {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :  ");
        int x = sc.nextInt();
        int product = 1;
        for(int i = 1;i<x+1;i++){
            product=product*i;
        }
        System.out.println("The factorial of n numbers = "+product);
    }
}
