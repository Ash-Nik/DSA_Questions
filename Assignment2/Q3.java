package Assignment2;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of three subjects :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Total marks = "+(x+y+z));
        System.out.println("Percentage marks : "+((x+y+z)/300)*100);
    }
}
