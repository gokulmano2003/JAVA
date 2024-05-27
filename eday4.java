
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class name {

    public String add(String name) {
       
        return name;
    }
}

class maths {

    public int plus(int a,int b) {
        a += b;
        return a;
//        System.out.println(a);
    }
}

class forloop {

    public void tenloop() {
        for (int ac = 0; ac <= 10; ac++) {

            System.out.println(ac);
        }

    }
}

class ifloop {

    public void result() {
        String user = "gokul";
        int pass = 12345;
        if (user == "gokul" && pass == 12345) {
            System.err.println("true");
        } else {
            System.err.println("fales");
        }

    }
}

class swi {

    public void first() {
        int a = 30;
        switch (a) {
            case 30: {
                System.err.println("first page a story Started");
                break;
            }

            case 21: {
                System.err.println("second page a  story");
                break;
            }
            default:
                System.err.println("End of Story");
                break;
        }
    }
}

public class NewClass1 {

    public static void main(String[] gokul) {
       

        name cas = new name();
       System.out.println( cas.add("gokul"));

        maths mts = new maths();
       int a= mts.plus(45,45);
       System.out.print(a);

//        forloop lop = new forloop();
//        lop.tenloop();

        ifloop ip = new ifloop();
        ip.result();

        swi de = new swi();
        de.first();

    }
}
