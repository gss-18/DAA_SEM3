/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK02;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass2q4 {
    public void merge(int a[],int l,int mid, int h){
        int n1=mid-l+1;
        int n2=h-mid;
        
        int c[]=new int[n1];
        int d[]=new int[n2];
        for(int i=0;i<n1;i++)
            c[i]=a[l+i];
        for(int j=0;j<n2;j++)
            d[j]=a[mid+1+j];
        
        int i,j,k;
        i=j=k=0;
        while(i<n1&&j<n2){
            if(c[i]<d[j]){
                a[k]=c[i];
                i++;
        }
            else{
                a[k]=d[j];
                j++;
            }
            k++;
    }
      while(i<n1){
          a[k]=c[i];
          i++;k++;
      }  
      while(i<n1){
          a[k]=d[i];
          j++;k++;
      }
}
    public void mergesort(int a[],int l,int h){
     
        if(l<h){
            int mid=(int)(l+h)/2;
            mergesort(a,l,mid);
            mergesort(a,mid+1,h);
            merge(a,l,mid,h);
            
        }

    }
    
    public static void main(String[] args){
          System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the elements: ");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
         Ass2q4 ob=new Ass2q4();
         ob.mergesort(a,0,a.length-1);
         System.out.print("Sorted array is:");
         System.out.append(Arrays.toString(a));
    }
    
}
