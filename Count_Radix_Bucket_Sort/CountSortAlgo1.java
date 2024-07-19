package Count_Radix_Bucket_Sort;

public class CountSortAlgo1 {
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
    static void countSort(int[]arr){
        int max = maxElement(arr);
        int count[]=new int[max+1];
        int[]output = new int[arr.length];
        for (int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for (int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for (int i =arr.length-1;i>=0;i--){
            int idx = count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        for (int i = 0;i<arr.length;i++){
            arr[i]=output[i];
        }
    }
    public static void main(String[] args) {
        int[]arr={1,4,5,6,6,3,3,2,4,4,5};
        System.out.println("Array before sorting : ");
        Display(arr);
        System.out.println();
        System.out.println("Array after sorting : ");
        countSort(arr);
        Display(arr);
    }
}
