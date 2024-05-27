/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class NewClass2 {
    public static void main(String hare[]){
        int Original=123456;
        int number=Original;
        int reverse=0;
        while(number!=0){
        int remaind=number%10;
        reverse=reverse*10+remaind;
        number=number/10;
        
        }
        System.out.print("reversenumber = "+reverse);
        System.out.print("originalnumber = "+Original);
        String result=(reverse==Original)?"palindrome":"not palindrome";
        System.out.print(result);
    }
}
