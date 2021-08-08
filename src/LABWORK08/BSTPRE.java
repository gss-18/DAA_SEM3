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
public class BSTPRE {
     static class node{
        String data;
        node lft,rgt;
        
        node(String value){
            this.data=value;
            this.lft=this.rgt;
            
        }
    }
    static node insert(node root,String value){
        if(root==null) 
            root=new node(value);
        else if(root.data.compareTo(value)>0)
            root.lft=insert(root.lft,value);
        else
            root.rgt=insert(root.rgt,value);
        
      return root;          
    }
    static void preorder(node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preorder(root.lft);
        
        preorder(root.rgt);
    }
    public static void main(String args[]){
        System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of nodes: ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" values: ");
        node root=new node(sc.next());
        for(int i=1;i<n;i++){
            insert(root,sc.next());
        }
        System.out.println("Post order traversal will be: ");
        preorder(root);
    }
    
}
