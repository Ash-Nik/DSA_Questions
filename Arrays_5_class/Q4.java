package Arrays_5_class;

import java.util.Scanner;

public class Q4 {
    static void swap(int[] arr){
        int i = 0;
        int z = arr.length-1;
        while (i<z){

        int temp=arr[z];
        arr[z]=arr[i];
        arr[i]=temp;
        i++;
        z--;
        }
    }
    static void print(int[] arr){
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] sortSquare(int[] arr){
        int[] ans=new int[arr.length];
        int k = 0;
        int i=0;
        int j=arr.length-1;
        while (i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k++]=arr[i]*arr[i];
                i++;
            }
            else {
                ans[k++]=arr[j]*arr[j];
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("sorted array :");
        int[] ans=sortSquare(arr);
        sortSquare(ans);

        print(ans);


    }
}
