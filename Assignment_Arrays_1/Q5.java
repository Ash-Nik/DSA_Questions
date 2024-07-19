package Assignment_Arrays_1;
//Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
//Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
//Leftmost and rightmost element cannot be a peak element.
public class Q5 {
    public static void main(String[] args) {
        int arr[]={1, 1, 3, 4, 2, 3, 5, 7, 0};

            for (int i = 0; i < arr.length-2; i++){
                int first = arr[i];
                int middle = arr[i+1];
                int next = arr[i+2];
                if(middle>first&&middle>next){
                    System.out.println(middle);
                }
                else if(next==arr[(arr.length)-1]){
                    break;
                }
            }


    }
}
