public class GreatestInteger {

    public static void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("The maximum integer is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The maximum integer is: " + b);
        } else {
            System.out.println("The maximum integer is: " + c);
        }
    }

    public static void main(String[] args) {
        max(12, 34, 4);
        max(34, 56, 56);
        max(234,345, 456);
        max(2345, 34556, 345666666);
        max(24475788,65178687,7765788);
    }
}
