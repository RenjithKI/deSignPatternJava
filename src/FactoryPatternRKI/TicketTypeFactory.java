package FactoryPatternRKI;

public class TicketTypeFactory{  
    
 //use getPlan method to get object of type Plan   
     public Ticket getTicketTypeFactory(String ticketType){  
          if(ticketType == null){  
           return null;  
          }  
        if(ticketType.equalsIgnoreCase("Student")) {  
               return new StudentPlan();  
             }   
         else if(ticketType.equalsIgnoreCase("normal")){  
              return new NormalPlan();  
          }   
       
    return null;  
 }  
}//end of GetPlanFactory class.  


