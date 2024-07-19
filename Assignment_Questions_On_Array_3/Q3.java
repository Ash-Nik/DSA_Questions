//You are given an integer array height of length n. There are n vertical lines drawn such that the
//two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the
//most water.
//Input 1:
//n = 9
//height = [1,8,6,2,5,4,8,3,7]
//Output 1:
//49
//Q2. Given an integer array arr, return the number of consecutive sequences(subarrays) with
//odd sum.􀀁
//Return the maximum amount of water a container can store.
package Assignment_Questions_On_Array_3;

import java.util.Scanner;
public class Q3 {
static void swap(int[] arr){
    int i = 0;
    int j = arr.length-1;
    int max = 0;
    while (i<j){
        int breadth=j-1;
        int height=Math.min(arr[i],arr[j]);
        int area=breadth*height;
        max = Math.max(area,max);
        if(arr[i]<arr[j]){
            i++;
        }
        else {
            j--;
        }
    }
    System.out.println(max);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] height= new int[x];
        System.out.println("Enter the array : ");
        for (int i = 0;i< height.length;i++){
            height[i]=sc.nextInt();
        }
        swap(height);
    }
}
