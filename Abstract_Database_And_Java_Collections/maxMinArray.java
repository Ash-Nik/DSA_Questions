package Abstract_Database_And_Java_Collections;

public class maxMinArray {
    static void print(int[]arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[]arr,int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void maxMin(int[]arr){

        for (int i = 0;i< arr.length;i++){
            int st=i;int end = arr.length-1;
            while (st<end){
                swap(arr,st, end);
                st++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        maxMin(arr);
        print(arr);
    }
}
