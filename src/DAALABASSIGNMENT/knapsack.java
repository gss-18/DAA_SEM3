/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAALABASSIGNMENT;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class knapsack {
    static int knapsack(int[] wt, int[] value, int n, int w) { 
            if(n==0 || w==0) { 
                return 0; 
            } 
            if(wt[n-1]>w) { 
                return knapsack(wt,value,n-1,w); 
            } 
            else { 
                return Math.max(knapsack(wt, value, n-1, w),  
                        value[n-1] + knapsack(wt, value, n-1, w-wt[n-1])); 
            }

	} 

	 

public static void main(String[] args) { 

System.out.println("Name : GSS Trivikram");
System.out.println("Roll No. : BTech/60001/19");
System.out.println("Branch : Computer Science and Engineering"); 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter number of elements: "); 
int n = sc.nextInt(); 
System.out.println("Enter the bag capacity: "); 
int w = sc.nextInt(); 
System.out.println("Enter weight: "); 
int[] wt = new int[n]; 
for(int i=0; i<n; i++) { 
    wt[i] = sc.nextInt(); 
} 
System.out.println("Enter cost: "); 
int[] val = new int[n]; 
for(int i=0; i<n; i++) { 
val[i] = sc.nextInt(); 
} 
System.out.println("Profit is: " +knapsack(wt, val, n, w)); 
} 
    
}
