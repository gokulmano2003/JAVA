/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class randomnumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Welcome "+name);
        String sam;
        do {
            double num1 = Math.floor(Math.random() * 50);
            double num2 = Math.floor(Math.random() * 50);
            int count1 = (int) num1;
            int count2 = (int) num2;
            int result=count1+count2;
            
            System.out.println("The First number is"+count1);
              System.out.println("The First number is"+count2);
              System.out.print("Enter your answer:");
            int user = sc.nextInt();
            if (result == user) {
                System.err.println("good");
            } else {
                System.err.println("your lose");
            }
             System.err.println("do you want to continue ! \"yes\" or \"no\"   " );
            sam = sc.next();
        } while (sam.equals("Yes") || sam.equals("yes"));
        
        System.out.println("Thanks for using my application");
    }
}
