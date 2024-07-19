package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to insert = ");
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0;i<n;i++){
            l.add(sc.nextInt());
        }
        System.out.println("Enter the element you want to insert at first index = ");
        int a = sc.nextInt();
        l.add(0,a);
        System.out.println(l);
    }
}
