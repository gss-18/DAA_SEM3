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
public class Ass1q4 {
    public  static void main(String args[]){
          System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'n' for matrix row and coloumn: ");
        int n=sc.nextInt();
        int[][] a= new int[n][n];
            System.out.print("Enter the elements of matrix: ");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=sc.nextInt();
                    
                }
            }
            System.out.println("The left diagonal is: ");
            for(int i=0;i<n;i++){
                 System.out.println(a[i][i]);
                      
            }
        }
        
    }
    

