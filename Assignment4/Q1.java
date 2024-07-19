package Assignment4;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int x = sc.nextInt();
        System.out.println("Enter breadth :");
        int y = sc.nextInt();
        if(x==y){
            System.out.println("Its a square");
        }
        else{
            System.out.println("Its a rectangle");
        }
    }
}
