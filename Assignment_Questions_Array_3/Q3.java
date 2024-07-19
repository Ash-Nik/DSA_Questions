package Assignment_Questions_Array_3;

import java.util.Arrays;

//- Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//missing number from the first N integers. There are no duplicates in the list.
public class Q3 {
    public static void main(String[] args) {
        int c = -1;
        int[] arr={1,2,3,5};
        Arrays.sort(arr);
        int[] arr2= new int[arr.length+1];
        int z = 1;
        for(int i = 0;i<arr2.length;i++){
            arr2[i]=z++;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr2[i]!=arr[i]){
                c=arr2[i];
                break;
            }
        }
        System.out.println(c);
    }
}
