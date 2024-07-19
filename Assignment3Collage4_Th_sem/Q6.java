package Assignment3Collage4_Th_sem;
//Given an array of even and odd numbers, write a program to separate
//even numbers from the odd numbers.
public class Q6 {
    static void print(int[]arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void separate(int[]arr){
        int st = 0;int end = arr.length-1;
        while (st<end){
            if (arr[st]%2==0){
                st++;
            }
            else {
                swap(arr,st,end);
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        separate(arr);
        print(arr);
    }
}
