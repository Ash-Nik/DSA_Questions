package Count_Radix_Bucket_Sort;

public class Radix {
    static void Display(int[]arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int maxElement(int[]arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void countSort(int[]arr,int place){
        int max = maxElement(arr);
        int[] count=new int[10];
        int[]output = new int[arr.length];
        for (int i = 0;i<arr.length;i++){
            count[(arr[i]/place)%10]++;
        }
        for (int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for (int i =arr.length-1;i>=0;i--){
            int idx = count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        for (int i = 0;i<arr.length;i++){
            arr[i]=output[i];
        }
    }
    static void getRadix(int[]arr){
        int max = maxElement(arr);
        for (int place = 1;(max/place)>0;place*=10){
            countSort(arr,place);
        }
    }
    public static void main(String[] args) {
            int[]arr = {802,3,4,98,56,789};
            getRadix(arr);
            Display(arr);
    }
}
