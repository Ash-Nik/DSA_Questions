package Assignment_on_Array_2;

import java.util.Scanner;

//Given an array of positive and negative numbers, arrange them in an alternate fashion such that
//every positive number is followed by a negative and vice-versa maintaining the order of appearance.
//The number of positive and negative numbers need not be equal. Begin with a negative number.
//If there are more positive numbers, they appear at the end of the array. If there are more negative
//numbers, they too appear at the end of the array.
public class Q2 {
    static void alternate(int[] arr){
        int c = 0;
        int[] arr2=new int[arr.length];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr=new int[x];
        for(int i = 0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }


    }
}
