/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;
import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POe {

    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
  
        //System.out.println(name);
        int a, b;
        String num1, num2;

       num1 = JOptionPane.showInputDialog(null,"Input 1st number");
       a = Integer.parseInt(num1);
       
        num2 = JOptionPane.showInputDialog(null,"Input 2nd number");
        b = Integer.parseInt(num2);
         
      //System.out.println("sum = "+(a+b));
      while (true){
        String menu = "======Menu=======\n"
   +"1. addition\n"
   +"2. subtration\n"
   +"3. division\n"
   +"4.multiplication\n"
   +"0 Exit";           
                
    
 String choice = JOptionPane.showInputDialog(menu);            
        
 
 
      switch (choice){
          case "1": JOptionPane.showInputDialog(null," The sum of " + a + " & " + b + " is " + ( a + b ) );
      break;
          case "2":
              JOptionPane.showInputDialog(null," The difference" + a + " & " + b + " is " + ( a - b ) );
         break;    
       case "3":
              JOptionPane.showInputDialog(null," The product of " + a + " & " + b + " is " + ( a * b ) );
         break;
       case "0": 
               JOptionPane.showInputDialog(null, "Exiting...");
               System.exit(0);
               break;
      
      }
        
      }
      
      
      
      
    }
}
