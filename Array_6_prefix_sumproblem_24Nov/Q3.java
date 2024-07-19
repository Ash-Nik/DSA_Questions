//check if we can partition the array into two sub array with equal sum .More formally check
// that the prefix sum of a part of the array is equal to the suffix sum of rest of the array :)

package Array_6_prefix_sumproblem_24Nov;
import java.util.Scanner;

public class Q3 {
    static int totalArray(int[] arr){
        int sum=0;
        for (int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    static Boolean findSub(int[] arr){
        int total=totalArray(arr);
        int prefix=0;
        for (int i = 0;i<arr.length;i++){
             prefix+=arr[i];
            int suffix=total-prefix;
            if(suffix==prefix){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the elements = ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        if(findSub(arr)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
