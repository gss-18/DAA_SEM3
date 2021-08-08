/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK03;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass3q4 {
    public static void main(String args[]){
        System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        BigInteger a,b,c;
        System.out.print("Enter a value: ");
        a=new BigInteger(sc.next());
        System.out.print("Enter b value: ");
        b= new BigInteger(sc.next());
        c=a.multiply(b);
        System.out.print(c);
    }
    
}
