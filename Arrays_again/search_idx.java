package Arrays_again;

public class search_idx {
    static int find(int[]arr,int x){
        for(int i = 0;i<arr.length;i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={1,5,7,2,6,8,3,1};
        int x = 7;
        System.out.println("Element found at idx = "+find(arr,x));
    }
}
