//Q8 - Write a program to print a triangle of prime numbers upto given
// number of lines of the trinagle.
//Input1:
//        2
//        Output1:
//        2
//        3 5
//        Input2:
//        6
package Assignment_on_loops;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows = ");
        int sum = 2;
        int z = 3;
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            int m = 1;
            for (int k = m; k <= i; k++) {
                while (true){
                    if (sum % m == 0) {
                        sum++;
                        m++;

                    }
                    if (sum % m != 0) {
                        System.out.print(sum+" ");
                        m=1;
                        sum++;
                        break;
                    }
                }
            }
                System.out.println();
        }
    }
}
