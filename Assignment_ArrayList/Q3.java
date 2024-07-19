package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    static void swap(ArrayList<Integer>list,int a,int b){
      Integer temp=Integer.valueOf(list.get(a));
         list.set(a,list.get(b));
        list.set(b,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element = ");
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            l.add(sc.nextInt());
        }
        System.out.println("Enter the indices to swap = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(l,a,b);
        System.out.println(l);
    }
}
