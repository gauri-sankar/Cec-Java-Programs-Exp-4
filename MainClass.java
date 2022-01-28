import java.util.*;

class Employe
{
  String name,adress;
  int Age;
  long salary,contactno;
  void Printsalary(long salary)
  {
      System.out.println("Salary:"+salary);
  }
  
  
}

class Officer extends Employe
{
    Scanner scn=new Scanner(System.in);
    String specialisation;
    void read()
    {
        System.out.println("ENTER OFFICER DETAILS");
        System.out.println("Name:");
        name=scn.nextLine();
       
        System.out.println("Adress:");
        adress=scn.nextLine();

        System.out.println("Specialization:");
        specialisation=scn.nextLine();
      
        System.out.println("Age:");
        Age=scn.nextInt();
      
        System.out.println("Salary:");
        salary=scn.nextLong();
      
        System.out.println("Contact no:");
        contactno=scn.nextLong();

        

    }

    void print()
    {
        System.out.println("___OFFICER DETAILS___");
        
        System.out.println("Name:"+name);
        System.out.println("Age:"+Age);
        System.out.println("Adress:"+adress);
        System.out.println("Contact no:"+contactno);
        System.out.println("Specialization:"+specialisation);
        Printsalary(salary);

    }
}

class Manager extends Employe
{
    Scanner scn=new Scanner(System.in);
    String department;
    void read()
    {
        System.out.println("ENTER MANAGER DETAILS");
        System.out.println("Name:");
        name=scn.nextLine();
       
        System.out.println("Adress:");
        adress=scn.nextLine();

        System.out.println("Department:");
        department=scn.nextLine();
      
        System.out.println("Age:");
        Age=scn.nextInt();
      
        System.out.println("Salary:");
        salary=scn.nextLong();
      
        System.out.println("Contact no:");
        contactno=scn.nextLong();

        

    }

    void print()
    {
        System.out.println("\n ___MANAGER DETAILS___");
        
        System.out.println("Name:"+name);
        System.out.println("Age:"+Age);
        System.out.println("Adress:"+adress);
        System.out.println("Contact no:"+contactno);
        System.out.println("Department:"+department);
        Printsalary(salary);

    }
}




 public class MainClass
{
    public static void main(String args[])
    {
    Officer a1=new Officer();
    a1.read();
    

    Manager m1=new Manager();
    m1.read();

    a1.print();
    m1.print();
}
}