// sort an array consists of only 0,1;
package Arrays_5_class;
import java.util.Scanner;
public class Q1 {
    static void sort1(int[] arr){
        int c = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                c++;
            }
        }
        for (int i = 0;i<c;i++){
            arr[i]=0;
        }
        for (int i =c;i< arr.length;i++){
            arr[i]=1;
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sort1(arr);
    }
}
