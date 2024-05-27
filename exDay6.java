/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class passcount {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        String dd;
        Scanner sc = new Scanner(System.in);
        int count=0;
        int good=0;
        int fail=0;
        do {
            System.err.println("Enter your internal mark");
            int a = sc.nextInt();
            System.err.println("Enter your exam mark");
            int b = sc.nextInt();
            int c = 35;
            a += b;
            System.out.print(a);

                       

            if (c == a) {
                System.out.println(" " + "pass");
                count++;
            } else if (c <= a) {
                System.out.println(" " + "good");
                good++;
            } else {
                System.out.println(" " + "fail");
                fail++;
            }
            
            System.out.println("pass"+count );
            System.out.println("good"+good); 
            System.out.println("fail"+fail);
            
            System.out.print("continue !!! :");
            dd = sc.next();

        } while (dd.equals("y") || dd.equals("Y"));
        System.out.print("Ok Continue");
    }

}
