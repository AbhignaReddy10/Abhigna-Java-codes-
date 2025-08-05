import java.util.Scanner;
  public class Calculator{
    public static void main(String args[])
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your first integer");
    int a= sc.nextInt();
    System.out.println("Enter your second integer");
    int b= sc.nextInt();

System.out.println("choose your operation: + * % -");
char op= sc.next().charAt(0);
int result=0;
  boolean valid = True;
switch(op) {
  case'+':
    return =a+b;
    break;
  case'-':
    return = a-b;
    break;
  case '*':
    return =a*b;
    break;
  case '/':
    if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    valid = false;
                }
                        
   default:
                System.out.println("Invalid operation.");
                valid = false;
}
if (valid) {
            System.out.println("Result = " + result);
        }

        sc.close(); // always close the scanner
    }
}
