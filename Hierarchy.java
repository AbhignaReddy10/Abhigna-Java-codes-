 class Hierarchy {
    void eat() {
        System.out.println("Eating...");
    }
}
class Dog extends Hierarchy{
    void bark() 
    {
        System.out.println("Barking...");
    }
}
class Cat extends Hierarchy {
    void meow()
    {
        System.out.println("Meowing...");
    }
}

class TestInheritance extends Dog{

    public static void main(String[] args)
    {
        TestInheritance a= new TestInheritance();
        a.bark();
    }
}

