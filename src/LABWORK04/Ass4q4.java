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
public class Ass4q4 {
    public static void main(String[] args) {
          System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the tree");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		
		Node root=new Node(ar[0]); // Creating a new node
		for(int k=1;k<n;k++)
		  {
			 root=insert(ar[k],root);	
		  }
		System.out.println("Pre Order Traversal");
		preOrder(root);
		sc.close();
		
		 
	 }
	
	
	public static void preOrder(Node node)
	{
		if(node!=null)
		{
			System.out.println(node.data);
			preOrder(node.left);	
			preOrder(node.right);
		}
	}
	
	
	
	public static Node insert(int val,Node first)
	{
		
		if(first==null)
			first= new Node(val);
		else if(val<=first.data)
		     first.left=insert(val,first.left);
		else
			 first.right=insert(val,first.right);
			
		return first;	
	}
	 
	
	
		static class Node{
			Node left,right;
			int data;
			
			Node(int data)
			{
				this.data=data;
				left=null;
				right=null;
			}
                }	
}
