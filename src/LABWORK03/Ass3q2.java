/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK03;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass3q2 {
    public static void main(String[] args){
          System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        int x[][]=new int[2][2];
        int y[][]=new int[2][2];
        System.out.print("Enter the first matrix: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                x[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the second matrix: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                y[i][j]=sc.nextInt();
            }
        }
        int z[][]=new int[2][2];
        int a,b,c,d,e,f,g,h;
        a=x[0][1];
        b=x[0][1];
        c=x[1][0];
        d=x[1][1];
        e=y[0][0];
        f=y[0][1];
        g=y[1][0];
        h=y[1][1];
        int p1,p2,p3,p4,p5,p6,p7;
        p1=a*(f-h);
        p2=(a+b)*h;
        p3=(c+d)*e;
        p4=d*(g-e);
        p5=(a+d)*(e+h);
        p6=(b-d)*(g+h);
        p7=(a-c)*(e+f);
        z[0][0]=p5+p4-p2+p6;
        z[0][1]=p1+p2;
        z[1][0]=p3+p4;
        z[1][1]=p1+p5-p3-p7;
        System.out.println("The resultant matrix is: ");
       System.out.println("The Resultant Matrix is");
	    for(int l=0;l<2;l++)
	    {
	    	for(int m=0;m<2;m++)
	    	  System.out.print(z[l][m]+" ");
	       System.out.println("");    
	    }
	}
                
            
        
        
    
    
}
