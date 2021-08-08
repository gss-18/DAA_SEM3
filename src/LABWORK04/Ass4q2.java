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
public class Ass4q2 {
    public static void main(String[] args) {
		 System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int x1=sc.nextInt();
		System.out.println("Enter the Second Number");
        int x2=sc.nextInt();
        int LCM=findLCM(x1,x2);
        int GCD=(int)((x1*x2)/LCM);
        System.out.println("The GCD of the two numbers is "+GCD);
 
        sc.close();
	}
	public static int findLCM(int a,int b)
	{
		int lcm=0;
		lcm=(a>b)? a:b;
		while(true)
		{
			  if(lcm%a==0 && lcm%b==0)
			   {
			     return lcm;   
			   }
		
		   lcm++;
		}
	}
}
