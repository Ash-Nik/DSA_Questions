//Q4- Write a program to print all Armstrong numbers between 1 to n. (Medium)
//        Explanation:
//        A three digit number is called the Armstrong number if the sum of the cube of
//        its digit is equal to the number itself.
//        E.g.- 153 is an Armstrong number because (1^3)+(5^3)+(3^3) = 153.

package Assignment_on_loops;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms  = ");
        int x = sc.nextInt();
        for (int i = 1;i<=x;i++){
        int arm=0;
        int temp=i;
        while (temp!=0){
            int num = temp%10;
            arm=arm+(num*num*num);
            temp=temp/10;
        }
        if(i==arm){
            System.out.println(i);
            }
        }

    }
}
