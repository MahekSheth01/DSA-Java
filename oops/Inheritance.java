package oops;
/*
 * Types:
 * 1.Single level
 * 2.Multi level
 * 3.Hierarchical
 * 4.Hybrid
 * 5.Multiple (Possible using Interface concept)
*/

class Shape{
    Shape()
    {
        System.out.println("Shape class");
    }
    
}
class Circle extends Shape{
    double r=10;
    double pi=3.14;
    public void area(){
        System.out.println(pi*r*r);
    }
}
class CircumCircle extends Circle{
    public void area(){
        System.out.println(2*pi*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        CircumCircle c=new CircumCircle();
        c.area();
    }
}
