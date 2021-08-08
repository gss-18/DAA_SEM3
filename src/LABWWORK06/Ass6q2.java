/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWWORK06;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass6q2 {
    public static void main(String args[]){
          System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String a=(String)sc.next();
        System.out.print("The str to be searched: ");
        String b=(String)sc.next();
        if(a.contains(b)){
            System.out.print("Found");
        }
        else{
            System.out.print("Not Found");
        }
    }
    
}
