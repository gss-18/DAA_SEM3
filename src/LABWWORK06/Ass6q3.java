/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWWORK06;

/**
 *
 * @author gsstr
 */
public class Ass6q3 {
    static int max(int a, int b) 
    { 
          return (a > b) ? a : b; 
    }
    public static void main(String agrs[]){   
        int val[] = new int[] { 80, 90, 120 };
        int wt[] = new int[] { 10, 30, 20 };
        int W = 60;
        int n = val.length;
        System.out.println(knapsack(W, wt, val, n));
    
    }
    public static int knapsack(int W,int wt[],int val[],int n){
          System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        int i,w;
        int K[][]=new int [n+1][W+1];
        for(i=0;i<=n;i++){   //for all items
            for(w=0;w<=W;w++){     //for all weights
                if(i==0||w==0)
                    K[i][w]=0;
                 else if(wt[i-1]<=w)  //checking if the ith item is more than weight or not then we consider including it and excluding the item
                      K[i][w] = max(val[i - 1]+ K[i - 1][w - wt[i - 1]],K[i - 1][w]);
                else
                                K[i][w]=K[i-1][w];
                
            }
        }
        return K[n][W];
    }
    
}
