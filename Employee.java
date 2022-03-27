import java.util.*;
 class Employee
{
    String Name;
    int Age;
    int Phonenumber;
    String Address;
    int Salary;
   
        public static void main(String args[])
    {
        Officer obj=new Officer();
        obj.salary();        
    }
}
class Officer extends Employee
{
    String specialization;
    String department;

 static void Salary()
    {
        System.out.println("Salary");
    }
}