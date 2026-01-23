//this program shows how to create a basic class and objects for a student
class Students{
    String name;
    int age;
    String branch;
    int grade;

}
public class Student{  
public static void main(String args[]){
    Students s1 = new Students();
    s1.name = "John";
    s1.age = 20;
    s1.branch = "Computer Science";
    s1.grade = 85;
    
        System.out.println("Student Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Branch: " + s1.branch);
        System.out.println("Grade: " + s1.grade);
        System.out.println();
    }
}
