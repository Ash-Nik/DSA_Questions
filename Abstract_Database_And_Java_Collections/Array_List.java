package Abstract_Database_And_Java_Collections;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(7);
        List.add(9);
        List.add(4);
        List.add(1);
        List.add(10);
        List.add(2,31);
        Collections.sort(List);
        System.out.println(List);
        Collections.sort(List,Collections.reverseOrder());
        System.out.println(List);
        System.out.println(List.get(3));

    }

}
