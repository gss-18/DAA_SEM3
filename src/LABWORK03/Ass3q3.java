/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK03;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass3q3 {
    public static void main(String[] args) {
          System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the Number and No of Selections");
	     int n=sc.nextInt(),r=sc.nextInt();
	     int val=cal(n,r);
	     System.out.println("The Value of Calculation is = "+val);
	     sc.close();
	     }
	public static int cal(int N,int R) {
		if(R==0 || R==N )
			return 1;
		else if(R>0 && R<N)
			return cal(N-1,R-1)+cal(N-1,R);
		else
			return 0;
	}
	
    
}
