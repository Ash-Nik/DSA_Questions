//Write a program to print Fibonacci series of n terms where n is input by user.
//Input1:
//        6
//        Output1:
//        1 1 2 3 5 8
//        Input2:
//        2
//        Output2:
//        1 1
package Assignment_on_loops;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms = ");
        int x = sc.nextInt();
        int temp=1;
        int c = 0;
        if(x<=0){
            System.out.println("-ve fibonacci is not possible : ");
        }
        if (x==1){
            System.out.println(temp);
        }
       else{
            System.out.print(temp+" ");
            for (int i = 2; i <= x; i++) {
                int z = temp+c;
                System.out.print(z+" ");
                c=temp;
                temp=z;
            }
        }
    }
}
