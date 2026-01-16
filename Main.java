 class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}  //this is an example of runtime polymorphism

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Main{
public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // This will call the overridden method in Dog class
    }
}
