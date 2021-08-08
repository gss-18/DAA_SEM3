/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAAexam;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Q1 {
    
   void fib(int m,int n){
       int first=0;int second=1;int next=0;
       
       while(next<=n){
           if(next>=m)
            System.out.print(" "+next);
           first=second;
           second=next;
           next=first+second;
       }
       m=0;
       n=0;
   }
   public static void main(String args[]) 
    {
        System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");

        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        m=sc.nextInt();
        System.out.print("Enter the value of n: ");
        n=sc.nextInt();
        System.out.println("Fibonacci Numbers are: ");
        Q1 a=new Q1();
        a.fib(m, n);
        
    }
    
}
