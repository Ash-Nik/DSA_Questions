package Assignment3Collage4_Th_sem;
//input: A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
//        A2[] = {2, 1, 8, 3}
//        Output: A1[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}
//
//        Input: A1[] = {4, 5, 1, 1, 3, 2}
//        A2[] = {3, 1}
//        Output: A1[] = {3, 1, 1, 2, 4, 5}
public class Q5 {
    static int max(int[]arr){
        int maxEle=Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>maxEle){
                maxEle=arr[i];
            }
        }
        return maxEle;
    }
    static void theAlgo(int[]arr,int[]arr2){
        int max = max(arr);
        int[]count = new int[max+1];
        for (int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k = 0;

    }
    public static void main(String[] args) {

    }
}
