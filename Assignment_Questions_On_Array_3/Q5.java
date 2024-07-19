//Given an array sorted in increasing order, return an array of squares of each number sorted
//in increasing order
//Input 1:
//N = 6
//Arr[] = [-5, -2, -1, 0, 4, 6]
//Output 1:
//[0, 1, 4, 16, 25, 36]
//Input 2:
//N = 5
//Arr[] = [2, 1, 0, 4, 6]
//Output 2:
//[0, 1, 4, 16, 36]

package Assignment_Questions_On_Array_3;

import java.util.Scanner;

public class Q5 {
    static void print(int[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] swap(int[] arr){
        int i = 0;int j= arr.length-1;
        int[] ans = new int[arr.length];
        int k = arr.length-1;
        while (i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k--]=arr[i]*arr[i];
                i++;
            }
            else {
                ans[k--]=arr[j]*arr[j];
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr= new int[x];
        System.out.println("Enter the array : ");
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        print(swap(arr));

    }
}
