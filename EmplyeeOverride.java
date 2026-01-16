 class Employee  {
    String name;
    double salary;
     Employee(String name, double salary){
        this.name= name;
        this.salary=salary;
     }
    void display(){
        System.out.println("name:"+ name);
        System.out.println("salary:"+ salary);

    }
}
class Manager extends Employee{
    double bonus;
    Manager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus=bonus;
    }
    @Override
    void display(){
        super.display();
        System.out.println("bonus:"+ bonus);
    }
    
}
public class EmplyeeOverride{
    public static void main(String[] args) {
        Employee e = new Employee("Rohan", 50000);
        e.display();
        System.out.println("--------");

        Employee mgr = new Manager("Sehan", 80000, 15000);
        mgr.display(); // This will call the overridden method in Manager class
    }
}

