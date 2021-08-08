/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daalabwork.LABWORK01;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass1q3 {
    public static void main(String args[]){
        System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix ");
        int p=sc.nextInt();
        System.out.print("Enter number of columns in first matrix ");
        int q=sc.nextInt();
        System.out.print("Enter number of rows in second matrix ");
        int m =sc.nextInt();
        System.out.print("Enter number of columns in second matrix ");
        int n =sc.nextInt();
        if(p==m && q==n){
            int a[][]=new int[p][q];
            int b[][]=new int[m][n];
            int c[][]=new int[m][n];
            System.out.print("Enter the elements of the first matrix: ");
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.print("Enter the elements of the second matrix: ");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    b[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    for(int k=0;k<q;k++){
                        c[i][j]=a[i][j]*b[i][j];
                    }
                }
            }
            System.out.println("Multiplication of matrix: ");
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
        else
        {
            System.out.println("Multiplication not possible");
        }
        
    }
    
}
