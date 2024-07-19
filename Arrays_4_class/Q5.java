////Rotate the given array 'a' by k steps ,where k is non-negative can be using extra space
////Note k can b greater than n as well
package Arrays_4_class;
import java.util.Scanner;
public class Q5 {
    static void rotate(int[] a,int k){
        int[] ans = new int[a.length];
       // int c=k-1;
        int z = 0;
        for(int i = a.length-k;i<a.length;i++){
            ans[z++]=a[i];
        }
        for(int i =0;i<a.length-k;i++){
            ans[z++]=a[i];
        }
        System.out.println("The array =  ");
        for (int i = 0;i<a.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x  = sc.nextInt();
        int[] arr= new int[x];
        for (int i = 0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the value of K : ");
        int k = sc.nextInt();
        k=k%arr.length;
            rotate(arr,k);
    }
}
