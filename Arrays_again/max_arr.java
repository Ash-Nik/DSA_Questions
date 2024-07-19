package Arrays_again;

public class max_arr {
    static int findMax(int[]arr){
        int c=Integer.MIN_VALUE;
        for (int x:arr){
            if (x>c){
                c=x;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[]arr={0,0,0,0,0,4,0,0,-1};
        System.out.println("Max element in the list = "+findMax(arr));
    }
}
