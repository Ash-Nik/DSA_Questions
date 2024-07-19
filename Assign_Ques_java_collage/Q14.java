//Q14. Write a program to count the frequency of each number present in an array.
package Assign_Ques_java_collage;

import java.util.Scanner;

public class Q14 {
    static void freqArray(int[] arr){
        int[] freq=new int[10020];
        for (int i = 0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i = 0;i< freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+" have a freq of -> "+freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array to check its frequency : ");
        for (int i =0;i< arr.length;i++ ){
            arr[i]=sc.nextInt();
        }
        freqArray(arr);


    }
}
