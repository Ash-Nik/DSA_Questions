package Assignment_Questions_Array_3;
import java.util.Scanner;
//Given an array of size n, find the total number of occurrences of given number x.
public class Q2 {
    static void occur(int arr[],int x){
        int c = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]==x){
                c++;
            }
        }
        System.out.println(c);
        if(c==0){
            System.out.println(0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of x = ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0;i<x;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the value to search the occurrence : ");
        int y = sc.nextInt();
        occur(arr,y);
    }
}
