package oops;
public class MultipleInheritanceExample {

    // First interface
    interface Flyable {
        void fly();
    }

    // Second interface
    interface Swimmable {
        void swim();
    }

    // A class implementing both interfaces
    static class Duck implements Flyable, Swimmable {
        public void fly() {
            System.out.println("Duck can fly.");
        }

        public void swim() {
            System.out.println("Duck can swim.");
        }
    }

    // main method
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();   // Output: Duck can fly.
        duck.swim();  // Output: Duck can swim.
    }
}
