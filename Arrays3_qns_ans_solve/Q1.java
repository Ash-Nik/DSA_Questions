package Arrays3_qns_ans_solve;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ethe value of x = ");
        int x = sc.nextInt();
        int count = 0;
        int[] arr={4,6,3,5,8,2};
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        System.out.println("Total number of pairs = "+count);
    }
}
