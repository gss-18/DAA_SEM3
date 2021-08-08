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
public class Ass6q1 {
    public static void main(String args[]){
          System.out.println("Name : GSS Trivikram");
        System.out.println("Roll No. : BTech/60001/19");
        System.out.println("Branch : Computer Science and Engineering");
        int count=0;String cha = null;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter String:");
    String a=sc.next();
    System.out.print("Enter the char to search: ");
    String b=sc.next();
    for(int i=0;i<a.length();i++){
         char ch=a.charAt(i);
         cha=String.valueOf(ch);
         if(cha.equals(b)){
        count++;
    }
         }
    
    System.out.print(count);
    }
}