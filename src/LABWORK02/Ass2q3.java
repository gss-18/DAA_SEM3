/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK02;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass2q3 {
    public int max(int[] a){
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public int min(int[] a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
          System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements ");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.print("Enter the elements ");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Ass2q3 m=new Ass2q3();
            System.out.println("Maximum value in array is: "+m.max(a));
            System.out.println("Minimum value in array is: "+m.min(a));
            //order is O(n)
    }
}
