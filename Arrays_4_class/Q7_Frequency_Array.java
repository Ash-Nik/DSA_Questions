package Arrays_4_class;

import java.util.Scanner;

public class Q7_Frequency_Array {
    static int[] makeFrequency(int[] arr){
        int[] freq=new int[100010];
        for(int i = 0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int x = sc.nextInt();
        int[] arr=new int[x];
        for (int i = 0;i<x;i++){
            arr[i]= sc.nextInt();
        }
        int[] freq =makeFrequency(arr);
        int z = x;
        while (z>0){
            System.out.println("Enter number to be search: ");
            int y = sc.nextInt();
            if(freq[y]>0){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
            z--;
        }
    }
}
