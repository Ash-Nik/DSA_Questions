package Assign5;
import java.util.Scanner;
public class reversing_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        String sum="";
        int x = sc.nextInt();
        while (x!=0){
            int z = x%10;
            sum=sum+z;
            x=x/10;
        }
        int a =Integer.parseInt(sum);
        System.out.println("Reverse of the number = "+a);
    }
}
