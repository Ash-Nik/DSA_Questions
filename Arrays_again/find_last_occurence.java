package Arrays_again;

public class find_last_occurence {
    static int findArr(int[]arr,int x){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,3,2,4};
        System.out.println("Last occurrence of element = "+findArr(arr,2));
    }
}
