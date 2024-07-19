package Assignment_Arrays_2;//Given an unsorted array arr[] of size N having both negative and positive integers, place
//all negative elements at the end of array without changing the order of positive elements
//and negative elements
//N = 8
//        arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
//        1 3 2 11 6 -1 -7 -5
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :  ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] arr2 = new int[n];
        int c = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                arr2[c++]=arr[i];
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<0){
                arr2[c++]=arr[i];
            }
        }
        for (int x:arr2){
            System.out.print(x+" ");
        }


    }
}
