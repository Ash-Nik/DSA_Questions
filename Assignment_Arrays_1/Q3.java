package Assignment_Arrays_1;
//Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
//elements.
public class Q3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        for(int x:arr){
            if(x%2==0){
                System.out.println(x);
            }
        }
    }
}
