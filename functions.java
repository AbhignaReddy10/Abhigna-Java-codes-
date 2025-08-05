
public class functions {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        if(a>b){
        return a - b;
        }

        else{
        return b-a;
        }

    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;  // or use % for remainder
    }

    public static void main(String[] args) {
        int sum = add(3, 4);
        int difference = sub(3, 4);
        int product = multiply(3, 4);
        int quotient = divide(9, 4);

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
    }
}
