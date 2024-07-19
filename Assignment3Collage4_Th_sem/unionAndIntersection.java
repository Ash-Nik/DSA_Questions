package Assignment3Collage4_Th_sem;
import java.util.HashSet;
public class unionAndIntersection {
    static void union(int[]arr1,int[]arr2){
        HashSet<Integer>union = new HashSet<>();
        for (int x:arr1){
            union.add(x);
        }
        for (int y:arr2){
            union.add(y);
        }
        System.out.println("The union of the array : "+union);
    }
    static void intersection(int[]arr1,int[]arr2){
        String z ="";
        HashSet<Integer>intersect = new HashSet<>();
        for (int x:arr1){
            intersect .add(x);
        }
        for (int y:arr2){
            if(intersect .contains(y)){
                z+=y;
            }
        }
        int k = Integer.parseInt(z);
        HashSet<Integer>intersect2 = new HashSet<>();

        while (k!=0){
            int n = k%10;
            intersect2.add(n);
            k/=10;
        }
        System.out.println("Intersection of the array : "+intersect2);
    }

    public static void main(String[] args) {
        int[]arr = {7, 1, 5, 2, 3, 6};
        int[]arr2={3, 8, 6, 20, 7};
        union(arr,arr2);
        intersection(arr,arr2);
    }
}
