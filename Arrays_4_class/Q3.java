package Arrays_4_class;
//Reverse an array using another array
public class Q3 {
    static void array(int arr[]){
        int[] ans = new int[arr.length];
        int c = 0;
        for(int i = (arr.length)-1;i>=0;i--){
            ans[c++]=arr[i];
        }
        System.out.println("Original array :");
        for (int i = 0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
        }
        System.out.println("Array after reverse :");
        for (int i = 0;i<arr.length;i++){
        System.out.print(ans[i]+" ");
     }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        array(arr);

    }
}
