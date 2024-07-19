package Arrays_again;

public class sum_of_element {
    static int sumArray(int[]arr){
        int c=0;
        for (int j : arr) {
            c += j;
        }
        return c;
    }
    public static void main(String[] args) {
        int[]arr={1,5,3};
        System.out.println(sumArray(arr));
    }
}
