package com.company;

import java.util.Scanner;

//import java.util.Math;
public class randomguessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mynumber=(int)(Math.random()*100);
        int usernumber=0;
       do{
           System.out.println("guess my number:");
            usernumber=sc.nextInt();

           if(usernumber==mynumber){
               System.out.println("correct number....");
           }
           else if(usernumber>mynumber){
               System.out.println("your number is too large");
           }
           else{
               System.out.println("your number is too small");
           }
       }while(usernumber>=0);
        System.out.println("my number was..");
        System.out.println(mynumber);
    }
}