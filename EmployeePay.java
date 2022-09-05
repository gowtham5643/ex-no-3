import java.util.Scanner;
class EmployeePay{
String Emp_name;
int Emp_id;
String Address;
String Mail_id;
int Mobile_no;
void display(){
System.out.println(Emp_name);
//Syetem.out.println(Address);
System.out.println(Emp_id);
System.out.println(Mail_id);
System.out.println(Mobile_no);
}
}
class Programmer extends EmployeePay{  
 int BP; 

 @Override
void display(){
    System.out.println(BP);
 System.out.println("DA"+0.97*BP);
 System.out.println("HRA"+0.10*BP);
    System.out.println("PF"+0.12*BP);
 System.out.println("STAFF CLUD FUND"+0.001*BP);
        
}
} 
class Assistant_Professor extends EmployeePay{  
 int BP; 

 @Override
void display(){
    System.out.println(BP);
 System.out.println("DA"+0.97*BP);
 System.out.println("HRA"+0.10*BP);
    System.out.println("PF"+0.12*BP);
 System.out.println("STAFF CLUD FUND"+0.001*BP);
        
}
} 
class Associate_Professor extends EmployeePay{  
 int BP; 

 @Override
void display(){
    System.out.println(BP);
 System.out.println("DA"+0.97*BP);
 System.out.println("HRA"+0.10*BP);
    System.out.println("PF"+0.12*BP);
 System.out.println("STAFF CLUD FUND"+0.001*BP);
        
}
} 
class Professor extends EmployeePay{  
 int BP; 

 @Override
void display(){
    System.out.println(BP);
 System.out.println("DA"+0.97*BP);
 System.out.println("HRA"+0.10*BP);
    System.out.println("PF"+0.12*BP);
 System.out.println("STAFF CLUD FUND"+0.001*BP);
        
}
} 
class Main{ 
public static void main(String args[]){
    System.out.println("\n 1.Programmer\n2.Assistant_Professor\n3.Associate_Professor\n4.Professor");
Scanner input=new Scanner(System.in);
System.out.print("Enter an integer: ");
int ch=input.nextInt();
 switch (ch) {
         case 1:
              EmployeePay e1=new EmployeePay();
           Programmer p1=new Programmer();
           e1.Emp_name="AjayTaz";
           e1.Address="Las Vegas";
           e1.Mail_id="Taz@gmail.com";
           e1.Emp_id=69;
           e1.Mobile_no=932567845;
           p1.BP=65000;
           p1.display();
              e1.display();
              break;
         case 2:
           EmployeePay e2=new EmployeePay();
           Assistant_Professor p2=new Assistant_Professor();
           e2.Emp_name="Gowtham";
           e2.Address="San Andreas";
           e2.Mail_id="Gowtham@gmail.com";
           e2.Emp_id=29;
           e2.Mobile_no=987321628;
           p2.BP=10000;
           p2.display();
              e2.display();
              break;
         case 3:
           EmployeePay e3=new EmployeePay();
           Associate_Professor p3=new Associate_Professor();
           e3.Emp_name="Kingsley";
           e3.Address="Los Angeles";
           e3.Mail_id="Kingsley@gmail.com";
           e3.Emp_id=57;
           e3.Mobile_no=987108754;
           p3.BP=54000;
           p3.display();
              e3.display();
              break;
         case 4:
           EmployeePay e4=new EmployeePay();
           Professor p4=new Professor();
           e4.Emp_name="Sachin";
           e4.Address="India";
           e4.Mail_id="sachin47@gmail.com";
           e4.Emp_id=640;
           e4.Mobile_no=981054215;
           p4.BP=56000;
           p4.display();
              e4.display();
              break;
         case 5:
           //exit(1);
         
         default: 
          System.out.println("enter correct choice");
   
      } 
}
}