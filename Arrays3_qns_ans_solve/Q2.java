package Arrays3_qns_ans_solve;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x = ");
        int x = sc.nextInt();
        int count = 0;
        int[] arr ={1,4,5,6,3};
        for(int i = 0;i<arr.length-2;i++){
            for(int j = i+1;j<arr.length-1;j++){
                for(int k = j+1;k< arr.length;k++){
                    if((arr[i]+arr[j]+arr[k])==x){
                      count++;
                    }
                }
            }
        }
        System.out.println(" the number is = "+count);
    }
}
