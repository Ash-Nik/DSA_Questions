package Assignment3Collage4_Th_sem;
//Write a program to find minimum swaps required to bring all elements
//less than given value together at the start of array.
public class Q4 {
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
    static void algo(int[]arr,int target){
        int i = 0;int j = arr.length-1;
        int c = 0;
            while (i < j) {
                if (arr[i] <=target){
                    i++;
                }
                else {
                    c++;
                    swap(arr,i,j);
                    j--;
                }
            }
        System.out.println("Total swaps : "+c);

    }

    public static void main(String[] args) {
        int[]arr={1,2,3,7,1,2,9,0,8,5,3,5,10,11};
        int x = 5;
        algo(arr,x);
        print(arr);
    }
}
