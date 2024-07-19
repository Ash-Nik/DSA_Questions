//Rotate the given array 'a' by k steps ,where k is non-negative without using extra space
//Note k can b greater than n as well
package Arrays_4_class;
import java.util.Scanner;
public class Q6 {
    static void swap(int[] arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    static void reverse(int[] arr , int i,int j){
        while (i<j) {
        swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void print(int[] arr){
        for (int b = 0;b< arr.length;b++){
            System.out.print(arr[b]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int x = sc.nextInt();
        int[] arr=new int[x];
        for(int i =0;i<x;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        k=k% arr.length;
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k, arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println("Array after Rotate:");
        print(arr);
    }
}
