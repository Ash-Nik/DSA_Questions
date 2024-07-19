package Arrays3_qns_ans_solve;

import java.util.Scanner;

public class Q3 {
    static  void unique(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for (int j = i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                arr[j]=-1;
                }
            }
        }
        for (int i = 0;i<arr.length;i++){
            if(arr[i]!=-1){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,2,1,3,7};
        unique(arr);
    }
}
