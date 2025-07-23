package oops;
public class Encapsulation {
    // private data members
    private String name;
    private int age;

    // public getter for name
    public String getName() {
        return name;
    }

    // public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // public getter for age
    public int getAge() {
        return age;
    }

    // public setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    // main method
    public static void main(String[] args) {
        Encapsulation emp = new Encapsulation();

        // Using setter methods to set values
        emp.setName("Mahek");
        emp.setAge(30);

        // Using getter methods to get values
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
    }
}
