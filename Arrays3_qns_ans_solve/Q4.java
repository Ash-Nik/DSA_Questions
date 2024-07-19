package Arrays3_qns_ans_solve;

import java.util.Scanner;

//find 2nd largest in given array
public class Q4 {
    public static void main(String[] args) {
        int[] arr = {6,6,7,3,7,9,9,4};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i = 0;i< arr.length;i++){
            if(arr[i]==max){
                 arr[i]=0;
            }
        }
        int max2=Integer.MIN_VALUE;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("Second largest = "+max2);


    }
}
