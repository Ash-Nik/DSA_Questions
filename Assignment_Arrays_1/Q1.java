package Assignment_Arrays_1;
//Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present
// in the array.
public class Q1 {
    static void arrays(int arr[]){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr={2,6,-5,-1,0,4,-9};
        arrays(arr);
    }
}
