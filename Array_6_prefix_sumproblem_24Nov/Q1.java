//Given an integer array 'a' return the prefix sum/running sum in the same array without
// creating a new one.
package Array_6_prefix_sumproblem_24Nov;
import java.util.Scanner;
public class Q1 {
    static void print(int[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] prefix(int[] arr){
        int ans=0;
        for (int i = 0;i<arr.length;i++){
            ans=ans+arr[i];
            arr[i]=ans;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter elements in the array ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        print(prefix(arr));
    }
}
