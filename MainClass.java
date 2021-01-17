/* 5.Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class  */

class ParentClass
{
  public void pmethod()
  {
    System.out.println("This is parent class");
  }
}

class ChildClass extends ParentClass{
  public void cmethod()
  {
    System.out.println("This is child class");
  }
}

public class MainClass
{
  public static void main(String [] args)
  {
    ParentClass p = new ParentClass();
    ChildClass c = new ChildClass();
    p.pmethod();
    c.cmethod();
    c.pmethod();
  }
}	