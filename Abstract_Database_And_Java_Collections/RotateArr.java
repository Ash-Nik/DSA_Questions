package Abstract_Database_And_Java_Collections;

public class RotateArr {
    static void print(int[]arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
    static  void rotate(int[]arr,int i,int j){
        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[] arr,int k ){
         k =k%arr.length-1;
         rotate(arr,0,k);
         rotate(arr,k+1, arr.length-1);
         rotate(arr,0, arr.length-1);
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int k = 2;
        rotate(arr,k);
        print(arr);


    }
}
