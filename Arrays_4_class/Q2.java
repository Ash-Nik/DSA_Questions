package Arrays_4_class;
//given 2 integers a and b ,Swap the two given integers \values using sum and difference method : )
public class Q2 {
    static void swap(int a ,int b){
        System.out.println("a and b before swapping : "+a+" , "+b);
        b= b-a;
        a=a+b;
        b=a-b;
        System.out.println("a and b after swapping : "+a+" , "+b);
    }
    public static void main(String[] args) {
        swap(5,9);

    }
}
