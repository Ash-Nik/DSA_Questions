package Arrays_5_class;
//Given an array of integers 'a' move alla the even integers at the beginning 0f the array followed by
// all odd integers the relitive order of odd or even integers doesnot matter return an array that
// satisfies this condition
import java.util.Scanner;

public class Q3 {
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
    static void getSorted(int[] arr,int i,int j){

        while (i<j){
            if(arr[i]%2!=0&&arr[j]%2==0){
                swap(arr,i,j);
                i++;j--;
            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2!=0){
                j--;
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
        System.out.println("Original array: ");
        print(arr);
        getSorted(arr,0,arr.length-1);
        System.out.println("Sorted array:");
        print(arr);
    }
}
