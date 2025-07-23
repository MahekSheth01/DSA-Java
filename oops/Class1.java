package oops;

class Pen{
    String name;
    int price;
    String color;
    public void getDetails(){
        System.out.println("Pen colour is : "+color);
        System.out.println("Name is : "+name);
        System.out.println("Price is : "+price);
    }
}

public class Class1 {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.name="Flair";
        pen1.price=20;
        pen1.color="Blue";
        pen1.getDetails();
    }
}
