package Assignment1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Assignment1_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x = ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y = ");
        int y = sc.nextInt();
        System.out.println("Number before swiping = "+x+" , "+y);
        int c = x;
        x=y;
        y=c;
        System.out.println("Number after swiping using the third number =  "+x+" , "+y);
        
    }
}
