/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK04;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass4q3 {
    public static void main(String[] args) {
         System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int x=sc.nextInt();
		System.out.println("Enter the Second Number");
        int y=sc.nextInt();
        
        int val=GCD(x,y);
       System.out.println(val);
	}
	public static int GCD(int m,int n)
	{
		if(n==0)
			return m;
		else if(m==0)
			return n;
		else if(m>=n)
			return GCD(n,m%n);
		else 
			return GCD(m,n%m);	
	}
    
}
