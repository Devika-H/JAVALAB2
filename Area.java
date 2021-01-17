//1.Write a Java class having overloaded methods to calculate area of rectangle and circle.


import java.io.*; 
class Area1
{
    void area(int a, int b)
    {
        System.out.println("Area of the rectangle is "+a*b+".");
    }
    void area(double r)
    {
        double ar = 3.14*r*r;
        System.out.println("Area of the circle is "+ar+".");
    }
}
public class Area 
{
     public static void main(String args[]) 
	{
	   Area1 obj = new Area1();
	   obj.area(5,4);
	   obj.area(1.0);
    }
}