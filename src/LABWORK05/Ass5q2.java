/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK05;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass5q2 {
 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        System.out.print("Enter n: ");
       int n=sc.nextInt();
        int m[][]=new int[n][n];
           System.out.print("Enter the elements of matrix: ");
           for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                   m[i][j]=sc.nextInt();
               }
           }
           
           System.out.println("Shortest path matrix");
           print(Algo(m));
           
    }
    
    public static int[][] Algo(int[][] m){
        for(int k=0;k<m.length;k++){
            for(int i=0;i<m.length;i++){
                for(int j=0;j<m.length;j++){
                    if(m[i][k]+m[k][j]<m[i][j]){
                        m[i][j]=m[i][k]+m[k][j];
                       
                    }
                }
            }
        }
        return m;
    }
    
    public static void print(int[][] matrix){
        
        for(int i=0;i<matrix.length;i++){
               for(int j=0;j<matrix.length;j++){
                   System.out.print(matrix[i][j]);
                   System.out.print("\t");
                   
               }
               System.out.print("\n");
           }
        System.out.print("\n");
    }
    
}
