package Assignment_Questions_Array_3;
//Given an array sorted in increasing order of size n and an integer x, find if there exists a
//pair in the array whose absolute difference is exactly x.(n>1)
public class Q1 {
    static boolean diff(int arr[],int x){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[j]-arr[i]==x){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={5,10,15,20,26};
        if(diff(arr,10)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
