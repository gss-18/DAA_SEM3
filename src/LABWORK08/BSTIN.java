/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK08;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class BSTIN {
     static class node{
        int data;
        node lft,rgt;
        
        node(int value){
            this.data=value;
            this.lft=this.rgt;
            
        }
    }
    static node insert(node root,int value){
        if(root==null) 
            root=new node(value);
        else if(root.data>value)
            root.lft=insert(root.lft,value);
        else
            root.rgt=insert(root.rgt,value);
        
      return root;          
    }
    static void inorder(node root){
        if(root==null)return;
        
        inorder(root.lft);
        System.out.print(root.data+" ");
        inorder(root.rgt);
    }
    public static void main(String args[]){
        System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of nodes: ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" values: ");
        node root=new node(sc.nextInt());
        for(int i=1;i<n;i++){
            insert(root,sc.nextInt());
        }
        System.out.println("In-order traversal will be: ");
        inorder(root);
    }
    
}
