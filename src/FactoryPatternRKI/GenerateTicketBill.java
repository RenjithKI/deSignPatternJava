package FactoryPatternRKI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateTicketBill{  
    public static void main(String args[])throws IOException{  
        TicketTypeFactory ticketPlanFactory = new TicketTypeFactory();  
          
        System.out.print("Enter the name of the ticket type:");  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    
        String planName=br.readLine();  
        System.out.print("Enter the number of units for tickets will be calculated: ");  
        int units=Integer.parseInt(br.readLine());  
    
        Ticket person = ticketPlanFactory.getTicketTypeFactory(planName);  
        //call getRate() method and calculateBill()method of DomesticPaln.  
    
         System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
         person.getRate();  
         person.calculateBill(units);  
              } 
    
    
    
      }//end of GenerateBill class.  
