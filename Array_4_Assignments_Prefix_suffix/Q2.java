//Given an integer array arr consisting of 0’s and 1’s only, return the max length of sequence
//which contains equal numbers of 0 and 1. If no such subArray exists, print -1

package Array_4_Assignments_Prefix_suffix;

import java.util.Scanner;

public class Q2 {
    static void maxLength(int[] arr){
        int zeroes = 0;
        int one = 0;
        for (int i = 0;i< arr.length;i++){
            if (arr[i]==0){
                zeroes++;
            }
            else one++;
        }
        if(zeroes==0||one==0){
            System.out.println(-1);
        }
       else if (zeroes<one){
            System.out.println(zeroes*2);
        }
       else if (one<zeroes){
            System.out.println(one*2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr=new int[x];
        System.out.println("Enter the elements only consists of zeroes and ones  = ");
        for (int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        maxLength(arr);
    }
}
