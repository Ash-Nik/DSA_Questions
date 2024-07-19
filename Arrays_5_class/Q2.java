//sort the array using 2 pointers
package Arrays_5_class;

import java.util.Scanner;
public class Q2 {
static void swap(int[] arr,int i,int z ){
    int temp=arr[z];
    arr[z]=arr[i];
    arr[i]=temp;
}
static void print(int[] arr){
    for(int i = 0;i< arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
static void sort(int[] arr,int i,int z){
    while (i<z){
        if(arr[i]==1&&arr[z]==0){
            swap(arr,i,z);
            i++;z--;
        }
        if(arr[i]==0){
            i++;
        }
        if(arr[z]==1){
            z--;
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int x = sc.nextInt();
        int[] arr=new int[x];
        for (int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        sort(arr,0, arr.length-1);
        System.out.println("Sorted array ");
        print(arr);
    }
}
