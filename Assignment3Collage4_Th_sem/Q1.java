package Assignment3Collage4_Th_sem;

public class Q1 {
    static void print(int[]arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void algo(int[]arr){
        int c=0;
        int st = 0;int end = arr.length-1;
        while (st<=end){
            if (arr[st]==0){
                st++;
            }
            else if(arr[end]==1){
                end--;
            }
            else {
                swap(arr,st,end);
                c++;
                st++;
                end--;
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        int[] arr={0, 1, 0, 1, 1, 0};
        algo(arr);
        print(arr);
    }
}
