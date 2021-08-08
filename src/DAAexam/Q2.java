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
public class Q2 {
    public static void main(String args[])
    {
        System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science aand Engineering");
   
        Scanner in = new Scanner(System.in);
        System.out.println("Enter order of matrix A: ");
        int n, i, j;
        n = in.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        System.out.println("Enter Elements of the array: ");
        for(i = 0 ; i < n ; i ++){
            for( j = 0 ; j < n ; j++){
                a[i][j]= in.nextInt();
            }
        }
        System.out.println("Array Inputed is : ");
        for(i = 0 ; i < n ; i ++){
            for( j = 0 ; j < n ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for( i = 0 ; i < n ; i ++){
            for(j = 0 ; j < n ; j++){
                if( i == 0 || i == (n-1) || j == 0 || j == (n-1) || i == j ||(i+j) == (n -1)){
                    b[i][j] = 0;
                }
                else{
                    b[i][j] = a[i][j];
                }                                
            }
        }
        System.out.println("Converted Array is: ");
        for(i = 0 ; i < n ; i ++){
            for( j = 0 ; j < n ; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
    

