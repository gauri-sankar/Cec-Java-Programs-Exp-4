abstract class Shape
{
   abstract void numberOfSides();
} 

class Rectangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("The number of sides of rectangle is 4");
    }

    
}

class Triangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("The number of sides of rectangle is 3");
    }

    
}

class Hexagon extends Shape
{
    void numberOfSides()
    {
        System.out.println("The number of sides of rectangle is 6");
    }

    
}

public class ShapeSides
{
    public static void main(String args[])
    {
        Rectangle R=new Rectangle();
        Triangle t=new Triangle();
        Hexagon H=new Hexagon();

        R.numberOfSides();
        t.numberOfSides();
        H.numberOfSides();
    }
}