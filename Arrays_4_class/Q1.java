package Arrays_4_class;
//given 2 integers a and b swap the 2 integers given value using a temporary value
public class Q1 {
    static void swap(int a,int b){
        System.out.println("Before swap "+a+","+b);
        int c = a;
        a=b;
        b=c;
        System.out.println("After swap "+a+","+b);
    }
    public static void main(String[] args) {
        swap(2,3);
    }
}
