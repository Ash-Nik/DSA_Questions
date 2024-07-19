package Assignment3Collage4_Th_sem;

public class dutchNationalFlagAlgo {
    static void print(int[]arr){
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void Algo(int[]arr){
        int st = 0;int mid = 0;int end = arr.length-1;
        while (mid<end){
            if(arr[mid]==0){
                swap(arr,st,mid);
                st++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                swap(arr,mid,end);
                end--;
            }

        }
    }
    public static void main(String[] args) {
        int[]arr= {1,0,1,2,2,1,2,0,0};
        Algo(arr);
        print(arr);
    }
}
