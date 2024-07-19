package Arrays_again;

public class Check_sorted_or_not {
    static boolean check(int[]arr){
        for (int i = 0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,9,6,7};
        if(check(arr)){
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }
}
