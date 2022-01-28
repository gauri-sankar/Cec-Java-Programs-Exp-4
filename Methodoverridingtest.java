class Employee
{
    void display()
    {
        System.out.println("The name of the class is Employee.");
    }

    void calcSalary()
    {
        System.out.println("The salary of the employee is 10000.");
    }
}

class Engineer extends Employee
{
    void calcSalary()
    {
        System.out.println("The salary of the engineer is 20000.");
        super.calcSalary();
    }
}

public class Methodoverridingtest
{
    public static void main(String args[])
    {
    Engineer eng=new Engineer();

    eng.display();
    eng.calcSalary();
    
}
    
}