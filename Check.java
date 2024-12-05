import java.util.Scanner;

public class Check {
    static void CheckAge(int age) {
        if (age < 18) {
            System.out.println("Minor detected. Not allowed.");
        } else {
            System.out.println("You are a major! Accepted.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("The age is: " + age);
        CheckAge(age); // Checking the entered age
        CheckAge(20);
        CheckAge(30);
        CheckAge(15);
    }
}
