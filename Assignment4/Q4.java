package Assignment4;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int x = sc.nextInt();
        if(x<0){
            System.out.println("Number is -ve and skipped");
        }
        else{
            System.out.println(x);
        }
    }
}
