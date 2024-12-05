import java.util.Scanner;
 class ReverseInt { 
public static void main(String [] args) {
 int num1; 
int rev=0; 
Scanner sc = new Scanner(System.in);
System.out.println("enter the number"); 
num1= sc.nextInt(); 
System.out.println("the number is"+num1);
 while(num1!=0) { 
int digit=num1%10; 
rev=rev*10+digit;
num1 =num1/10;
 } 
sc.close();
 System.out.println("the reverse of the number is:"+ rev); 

} 
}
 