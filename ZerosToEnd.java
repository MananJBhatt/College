package com.manan;
import java.util.Scanner;
public class ZerosToEnd {
    public static void sort(int [] arr){
        int i=0;
        int x=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
            arr[x]=arr[i];
            x++;
            }
        }
        while(x<arr.length){
            arr[x]=0;
            x++;
        }
        for(i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int[] arr1 = new int[size];

        int i;
        for(i=0;i< arr1.length;i++){
            arr1[i]= scan.nextInt();
        }
        sort(arr1);
    }
}
