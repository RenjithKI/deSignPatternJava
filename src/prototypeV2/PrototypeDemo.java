package prototypeV2;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;

  //https://www.javatpoint.com/prototype-design-pattern

public class PrototypeDemo{  
     public static void main(String[] args) throws IOException {  
          
        
        System.out.print("Enter Employee Id: ");  
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("Enter Employee Id:>> ");
        int eid=Integer.parseInt(br.readLine());  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Name: ");  
        String ename=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Designation: ");  
        String edesignation=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Address: ");  
        String eaddress=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Salary: ");  
        double esalary= Double.parseDouble(br.readLine());  
        System.out.print("\n");  
           
        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);  
          
        e1.showRecord();    e1.hashCode();  
        System.out.println("\n   ==== "+e1.hashCode()); 
        
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
        e2.showRecord();  
        System.out.println("\n   ==== "+e2.hashCode()); 
        
        //RKI
        System.out.println(">>>>>>>>>>>>>>>>>>"); 
        EmployeeRecord e3=(EmployeeRecord) e1.getImage();  
        e2.showRecord();  
        System.out.println("\n   ==== "+e3.hashCode()); 
        
    }     
}//End of the ProtoypeDemo class.  