/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK05;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass5q1 {
    public static void main(String args[]){
          System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    
}
