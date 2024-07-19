package Assignment_Arrays_2;//to check that the array is sorted or not

public class Assignment_Arrays2 {

    static boolean sorted(int[] arr){
        for (int i = 1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        if( sorted(arr)){
            System.out.println("Array is sorted");
        }
       else{
            System.out.println("Array is not sorted;");
        }


    }
}
