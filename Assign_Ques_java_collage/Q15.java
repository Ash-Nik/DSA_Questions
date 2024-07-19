//Write a program to count how many prime numbers present in an array
package Assign_Ques_java_collage;

public class Q15 {
    static int countPrime(int[] arr){
        int c = 0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]==1){
                continue;
            }
            for (int j = 2;j<arr[i];j++){
                if(arr[i]%j!=0){
                    c++;
                }
                break;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,7,11,11,13,17,2,4,6,8,6,11};
        System.out.println("Total number of prime numbers = "+countPrime(arr));






    }
}
