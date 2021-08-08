/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK02;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass2q1 {
    
        static int binarySearch(int a[],int key){
            int l=0,h=a.length-1,mid;
            while(l<=h){
                mid=(l+h)/2;
                if(a[mid]==key){
                    return mid;
                }
                if(a[mid]<key){
                    l=mid+1;
                }
                else
                    h=mid-1;
               }
            return -1;
        }
    
        public static void main(String[] args){
              System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.print("Enter the elements: ");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.print("Enter the key to be searched: ");
            int key=sc.nextInt();
            int result=binarySearch(a,key);
            if(result==-1){
                System.out.println("Element not found: ");
            }
            else{
                System.out.println("Element found: ");
            }
        }
    }
  
