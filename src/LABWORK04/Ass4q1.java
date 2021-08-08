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
public class Ass4q1 {
        public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
        System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        System.out.println("\nEnter the First Number");
        int x1=sc.nextInt();
	System.out.println("\nEnter the Second Number");
        int x2=sc.nextInt();
        int ans=findLCM(x1,x2);
        System.out.println("\nLCM of the two numbers is "+ans);
        
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
