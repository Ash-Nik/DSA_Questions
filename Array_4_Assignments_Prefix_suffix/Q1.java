//Given an array of integers of length n, and an integer m, (m < n), divide the array into
//        2 subArrays such that 1 part contains m elements and the other part contains the rest of
//        the elements. This division has to be done such that the difference between the sum of
//        elements of both the sub arrays is the maximum. You have to print the maximum difference
//        in the sum possible.
package Array_4_Assignments_Prefix_suffix;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    static int sumTotal(int[] arr){
        int sum = 0;
        for (int x:arr){
            sum+=x;
        }
        return sum;
    }
    static int maxDifference(int[] arr,int m){
        Arrays.sort(arr);
        int total=sumTotal(arr);
        int prefix=0;
        for (int i = 0;i<m;i++){
            prefix+=arr[i];
        }
        int suffix = total-prefix;
        return suffix-prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Entering the elements :  ");
        for (int i = 0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of m = ");
        int m = sc.nextInt();
        System.out.println(maxDifference(arr,m));
    }
}
