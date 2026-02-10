//aim: to write a java program that takes input n and gives its factorial
import java.util.Scanner;
public class Fact{
public int factorial(int n ){
int result =1;
while (n>0){
result = result*n;
n--;
}
return result;
}
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("give a number:");
int num = sc.nextInt();
Fact sol = new Fact();
int res = sol.factorial(num);
System.out.println(res);
sc.close();
}
}