package oops;

abstract class Animal{
    abstract void getdata();
}

class Dog extends Animal{
    public void getdata(){
        System.out.println("Dog");
    }
}

class Horse extends Animal{
    public void getdata(){
        System.out.println("Horse");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.getdata();
    }
}
