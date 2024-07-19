//Q1. Given an array arr[] of size n, find the first repeating element.
// The element should occur more than
//once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
package Assignment_on_Array_2;

import java.util.Scanner;

public class Q1 {
    static int first(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j  = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return i+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr=new int[x];
        for(int i = 0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(first(arr));

    }
}
