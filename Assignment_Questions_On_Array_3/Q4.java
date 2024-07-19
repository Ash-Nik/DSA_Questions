//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
//find two numbers such that they add up to a specific target number.
//Return the indices of the two numbers added by one. Return -1 if pair does not exist
package Assignment_Questions_On_Array_3;

import java.util.Scanner;

public class Q4 {
    static void add(int[] arr,int m){
        int n = arr.length;
        int z = 0;
        for(int i = 0;i<arr.length-1;i++){
            for (int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==m){
                    z=arr[i]+arr[j];
                    System.out.println(i+1+","+(j+1));
                    break;
                }

            }
        }
        if(z!=m){
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int [] arr= new int[x];
        System.out.println("Enter the array : ");
        for (int i = 0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int m = sc.nextInt();
        add(arr,m);

    }
}
