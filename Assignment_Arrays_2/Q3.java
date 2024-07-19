package Assignment_Arrays_2;

import java.util.Arrays;
import java.util.Scanner;

//Given an array arr[] and an integer K where K is smaller than size of array, the task is to
//find the Kth smallest element in the given array. It is given that all array elements are
//distinct.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays    : ");
        int x = sc.nextInt();
        int[] arr=new int[x];
        for (int i = 0;i<x;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the kth number ");
        int k = sc.nextInt();
        System.out.println(arr[k-1]);

    }
}
