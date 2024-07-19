package Assignment_Arrays_2;
//Write a Java program to test the equality of two arrays
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array one = ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Entering the elements in the array one ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array :");
        int y = sc.nextInt();
        int[] arr2 = new int[y];
        System.out.println("Entering the elements two :  ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        if (x != y) {
            System.out.println("False");
        } else {
            int c = 0;
            int d=0;
            for (int i = 0; i < arr.length;i++){
                if(arr[c++]!=arr2[d++]){
                    System.out.println("False");
                    break;
                }
                else{
                    System.out.println("true");
                }
            }
        }
    }
}