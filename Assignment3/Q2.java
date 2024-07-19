package Assignment3;
//Swap two numbers without the use of third variable.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Enter y : ");
        int y =sc.nextInt();
        System.out.println("Numbers before swiping :  "+ x +" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Numbers after swiping : "+ x +" "+y);
    }
}
