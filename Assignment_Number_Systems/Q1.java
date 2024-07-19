package Assignment_Number_Systems;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number = ");
        int x = sc.nextInt();
        String sum = "";
        while (true){
            int z = x%2;
            sum=sum+z;
            x=x/2;
            if(x==1||x==0){
                sum=sum+x;
                break;
            }
        }
        String sum2="";
        int a = Integer.parseInt(sum);
        while (a!=sum.charAt(0)){
            int k = a%10;
            sum2=sum2+k;
            a=a/10;
        }
        System.out.println("Binary conversion = "+sum2);

    }
}
