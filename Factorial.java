/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Factorial {

    static int fact(int num){
        if(num == 1){
            return num;
        }
        return fact(num - 1)*num;
    }   
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = sc.nextInt();
        System.out.println("Factorial of "+num +" is: " +fact(num));
    }
    
}
