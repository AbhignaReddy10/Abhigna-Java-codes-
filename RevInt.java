import java.util.Scanner;

class RevInt {
    public static void main(String[] args) {
        int num1;
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        num1 = sc.nextInt();
        System.out.println("The number is: " + num1);
        
        while (num1 != 0) {
            int digit = num1 % 10;
            rev = rev * 10 + digit;
            num1 = num1 / 10;
        }
        
        sc.close();
        System.out.println("The reverse of the number is: " + rev);

    }
}
