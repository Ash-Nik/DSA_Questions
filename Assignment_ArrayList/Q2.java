package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arraylist = ");
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            l.add(sc.nextInt());
        }
        int a = 2;
        if(a<l.size()){
        l.remove(a);
        }
        System.out.println(l);
    }
}
