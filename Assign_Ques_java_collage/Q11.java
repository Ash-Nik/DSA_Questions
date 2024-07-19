//Q11. Write a program to revers all word of a sentence.
package Assign_Ques_java_collage;

import java.util.Scanner;

public class Q11 {
    static void printString(String[] arr){
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static String[] swap(String[] arr,int i,int j){
        String temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;

    }
    static void mainFunction(String arr[]){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence = ");
        String str = sc.nextLine();
        String[] str2=str.split("");
        mainFunction(str2);
        printString(str2);
    }
}
