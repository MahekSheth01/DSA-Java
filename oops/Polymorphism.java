package oops;
//Method Overriding
//Compile time Polymorphism

class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println("Name: "+name);
    }
    public void printInfo(String name,int age){
        System.out.println("name : "+name+" "+"Age : "+" "+age);
    }
    public void printInfo(int age){
        System.out.println("Age : "+age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.printInfo("Rahul");
        s1.printInfo("Rahul", 20);
        s1.printInfo(20);
    }
}
