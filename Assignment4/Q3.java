package Assignment4;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost prize  : ");
        int cp = sc.nextInt();
        System.out.println("Enter selling prize : ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("Profit : "+(sp-cp));
        }
        else{
            System.out.println("Loss :"+(cp-sp));
        }


    }
}
