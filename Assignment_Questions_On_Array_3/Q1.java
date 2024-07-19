//Given an integer m, n, and n integers, return true if the number of unique integers among the n
//integers is greater than or equal to m, else return false.(Integers appearing multiple times are all
//considered as 1 unique integer)
package Assignment_Questions_On_Array_3;

import java.util.Scanner;

public class Q1 {
    static boolean num(int[] arr,int m){
        int comp=0;
        int n = arr.length;
        int [] freq = new int[100000];
        for (int i = 0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for (int i = 0;i<arr.length;i++){
            if(freq[i]>0){
                comp++;
            }
        }
        if(comp>=m){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of size of the array : ");
        int x = sc.nextInt();
        int[] arr=new int[x];
        for (int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number m: ");
        int m = sc.nextInt();
        if (num(arr,m)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
