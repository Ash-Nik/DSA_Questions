package Assignment4;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number = ");
        int x = sc.nextInt();
        if(x<0){
            System.out.println("Absolute value :"+x*-1);
        }
        else{
            System.out.println(x);
        }
    }
}
