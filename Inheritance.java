public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // Inherited method
        d.bark();   // Dog's own method
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound!");
    }
}

class Dog extends Animal {  // Child class
    void bark() {
        System.out.println("Dog barks!");
    }
}