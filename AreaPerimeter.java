//3.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

import java.io.*; 
class Triangle
{
  int x,y,z;
  double Area()
  {
    double ar = (x+y+z)/2;
    return Math.sqrt(s*(s-x)(s-y)(s-z));
  }
  int Perimeter()
  {
    return (x+y+z);
  }
}

public class AreaPerimeter{
  public static void main(String [] args)
  {
    Triangle T = new Triangle();
    T.x = 1;
    T.y = 2;
    T.z = 3;
    System.out.println(T.Area());
    System.out.println(T.Perimeter());
  }
}			