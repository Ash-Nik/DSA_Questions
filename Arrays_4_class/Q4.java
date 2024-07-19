package Arrays_4_class;
//reversing an array without using an extra space
// Note next time use while loop cause when we break and if n is odd the middle one will become zero
public class Q4 {
    static void array(int[] arr,int a,int b){
        for(int i = 0;i<arr.length;i++){
            arr[b]=arr[b]-arr[a];
            arr[a]=arr[a]+arr[b];
            arr[b]=arr[a]-arr[b];
            a++;
            b--;
            if(a>b){
                break;
            }
        }
        System.out.println("Reversed arrar : ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        array(arr,0,arr.length-1);
    }
}
