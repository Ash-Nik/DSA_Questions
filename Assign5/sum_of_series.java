//1-2+3-4+....+n
package Assign5;
import java.util.Scanner;
public class sum_of_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int x  = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<x+1;i++){
            if(i%2==0){
               sum+=-1*i;
            }
            else if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("The answer of the series = "+sum);


    }
}
