package Arrays3_qns_ans_solve;

public class Q5 {
    static int repeat(int[] arr){
        for(int i = 0;i< arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];

                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,5,3,4,6,3,4};
        System.out.println(repeat(arr));
    }
}
