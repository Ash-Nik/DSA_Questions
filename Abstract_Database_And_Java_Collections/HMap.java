package Abstract_Database_And_Java_Collections;
import java.util.HashMap;
public class HMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Abhishek",92);
        hm.put("Akash",95);
        hm.put("Tina",91);
        hm.put("Arbind",90);
        hm.put("Srabani",82);
        System.out.println(hm);
        for (String x:hm.keySet()){
            System.out.println(x+" HAS NUMBER :"+hm.get(x));
        }
    }
}
