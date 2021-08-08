/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK03;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass3q1 {
    static double expo(double x,double n){
        double a;
        if(n==0)
            return 1;
        a=pow(x,n/2);
        if(n%2==0)
            return a*a;
        else
            return x*a*a;
    }
    
    public static void main(String[] args){
          System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter values of x and n: ");
        double x=sc.nextDouble();
        double n=sc.nextDouble();
        System.out.print("The value is: "+ expo(x,n));
    }
}
