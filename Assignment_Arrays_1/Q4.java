package Assignment_Arrays_1;
//Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
//for calculating the minimum element.
public class Q4 {
    public static void main(String[] args) {
        int arr[]= {2,-3,5,8,1,0,-4};
        int min=Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element = "+min);

    }
}
