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
public class queen {
    static int n;
     public static void main(String args[]){
         System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for N: ");
        n=sc.nextInt();
        queen q=new queen();
        if(n<16){
        q.start();
        }
        else{
            System.out.print("N must be less than 16");
        }
    }
    private void start(){
        int box[][]=new int[n][n];
        if(solution(box,0)==false)
            System.out.print("No solution exist");
        printbox(box);
    }

    private boolean solution(int[][] box, int col) {
        if(col>=n)return true;
        for(int i=0;i<n;i++){
            if(placeQ(box,i,col)==true){
                box[i][col]=1;
                if(solution(box,col+1)==true)return true;
                box[i][col]=0;
            }
        }
        return false;
    }

    private void printbox(int[][] box) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(box[i][j]==0)System.out.print("[]\t ");
                else
                    System.out.print("Q\t");
            }
            System.out.print("\n");
        }
    }

    private boolean placeQ(int[][] box, int row, int col) {
       
        for(int i=0;i<col;i++)
            if(box[row][i]==1)return false;
        for(int i=row,j=col;i>=0&&j>=0;i--,j--)
            if(box[i][j]==1) return false;
        for(int i=row,j=col;j>0&&i<4;i++,j--)
            if(box[i][j]==1) return false;
       return true; 
    }
   
    
}
    

