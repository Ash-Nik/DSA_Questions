package Assignment_ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>l = new ArrayList<>();
        System.out.println("Enter the size of array = ");
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            l.add(sc.nextInt());
        }
        System.out.println("Array before sort :");
        System.out.println(l);
        System.out.println("Array after sort : ");
        Collections.sort(l);
        System.out.println(l);
    }
}
