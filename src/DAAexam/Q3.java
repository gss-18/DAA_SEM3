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
public class Q3 {
   public static void main(String args[])
    {
        System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
      
        Scanner in = new Scanner(System.in);
        int l1, l2, i = 0 , j = 0;
        System.out.println("Enter Size of First String: ");
        l1 = in.nextInt();
        System.out.println("Enter String: ");
        String s1 = in.next();
        System.out.println("Enter Size of Second String: ");
        l2 = in.nextInt();
        System.out.println("Enter String: ");
        String s2 = in.next();
        String s3 = s1+s2;
        String s4 = "";
        char a[] = new char[l1+l2];
        s3 = s3.toUpperCase();
        for( i = 0 ; i < (l1+l2) ; i++){
            a[i] = s3.charAt(i);
        }
        for(i = 0; i < l1+l2 ; i++){
		for(j = 0; j < l1+l2-1; j++)
		{
			if(a[j+1] < a[j])
			{
				char temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
        }
        for( i = 0 ; i < (l1+l2) ; i++){
            s4 = s4+a[i];
        }
        System.out.println("Merged String is : "+s4);
    }  
}
