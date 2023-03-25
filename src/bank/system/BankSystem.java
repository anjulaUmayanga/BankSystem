/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.system;
import java.util.Scanner;
/**
 *
 * @author Anjula
 */
public class BankSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 12345;
        int pin=123;
        float available_balance=15000 ,  new_balance;
        System.out.println("Enter Acount number: ");
        int get_card=sc.nextInt();
        System.out.println("Enter pin number: ");
        int get_pin=sc.nextInt();
        
        while(true){

        if (get_card == number && get_pin == pin) {
            System.out.println("###########################");
            System.out.println("Select one option:");
            System.out.println("1: Check Availabe Balance ");
            System.out.println("2: Deposit ");
            System.out.println("3: wiwthdrowl ");
            System.out.println("4:exit ");
            int input=sc.nextInt();
            
            if (input == 1) {
                System.out.println("availabe balance  is: "+available_balance);
                
                
            }
            else if(input == 2){
                
                System.out.println("Enter Deposit Amount: ");
                float dep_amount = sc.nextFloat();
                new_balance=dep_amount+available_balance;
                available_balance=new_balance;
                
                
            }
            else if(input == 3){
                if(available_balance != 0){
                System.out.println("Enter Deposit Amount: ");
                float wit_amount = sc.nextFloat();
                available_balance=available_balance-wit_amount;
                } else{
                       System.out.println("Your balance is not inuff");
                    }
                
            }
            else if(input == 4){
                break;
            }
            
            
        }else{
            
                System.out.println("Incorect Acount number or Pin");
                 System.out.println("Enter Acount number: ");
                get_card=sc.nextInt();
                System.out.println("Enter pin number: ");
                get_pin=sc.nextInt();
            
            
          
        }
        }
        
    }
    
}
