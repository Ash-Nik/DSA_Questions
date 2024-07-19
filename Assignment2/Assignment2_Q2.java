package Assignment2;
import java.util.Scanner;
// input two different strings and print them in a same line..
public class Assignment2_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first string : ");
        String one =sc.next();
        System.out.print("Input 2nd string :");
        String two = sc.next();
        System.out.println(one + two);
    }
}
