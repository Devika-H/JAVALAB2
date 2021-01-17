//4.Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

import java.util.*;
class Area
{
  int len, brd;
  Area(int l, int b)
  {
    len = l;
    brd = b;
  }
  int returnArea()
  {
    return len*brd;
  }
}

public class RectangleArea 
{
  public static void main(String [] args)
  {
	 int l,b; 
    Scanner s = new Scanner(System.in);
    System.out.println("Insert length of the rectangle");
    l = s.nextInt();
    System.out.println("Insert breadth of the rectangle");
    b = s.nextInt();
    Area ar = new Area(l,b);
    System.out.println("Area of the rectangle= "+ar.returnArea());
  }
}				