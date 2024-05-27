/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class operatores {
    public static void main(String[] gok){
        Scanner sc=new Scanner(System.in);
        String choice;   
        int count=0;
        
        do{
          if(count>=1){
             System.err.println("Continue");
            }   
        System.out.println("Enter one number");
       
       int a=sc.nextInt();
       int couter=0;
       for(int i=1;i<a;i++){
           if(a%i==0){
               couter++;
           }
       }
       System.out.println(couter+" Condition Meets");
//       if(couter==1){
//           System.out.println("prime");
//       }else{
//           System.out.println("not a prime number");
//       }
       String result=(couter==1)?"Prime":"Not a Prime";
       System.out.println(result);
       System.out.println("Do you want to continue");
       choice =sc.next();
       count++;
        
        }while(choice.equals("y")||choice.equals("Y"));
      
            System.out.print("ended");
        
    }
}
