package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    static void getPositive(ArrayList<Integer>list,int n){
        int c = 0;
        for (int i = 0;i<n;i++){
            if (list.get(i)>=0){
                System.out.println(list.get(i));
                c++;
            }
        }
        if (c==0){
            System.out.println("NA");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>l = new ArrayList<>();
        System.out.println("Enter the number of terms = ");
        int x = sc.nextInt();
        System.out.println("Enter the numbers = ");
        for (int i = 0;i<x;i++){
            System.out.println(sc.nextInt());
        }
        getPositive(l,x);
    }
}
