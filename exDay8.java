/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
class Statment {

    public static void view(String name) {
        System.out.println("1: view Aomunt");
        System.out.println("2: withdrow amount");
        System.out.println("3: deposite amount");
        System.out.println("4: mini Statment"+name);

    }
}

public class whileloop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to continue");

        Statment std = new Statment();

        while (true) {
            System.out.println("enter 1 to 3  continue");
            int aa = sc.nextInt();
            switch (aa) {
                case 1:
                    std.view(" "+"gokul");
                    System.out.println("amount withdrow:");
                    break;
                case 2:
                    std.view("gokul");
                    System.out.println("amount withdrow");
                    break;
                case 3:
                    std.view(":gokul");
                    System.out.println("amount deposite");
                case 4:
                    std.view("view");
                    System.exit(0);

            }
        }
    }
}
