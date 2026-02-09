// this program is to check if teh given number is prime or not
//it takes in the user input and runs the for loop to get the answer.
import java.util.Scanner;
class Solution{
public Boolean isPrime(int n){
if (n==1)return false;
for(int I =2;i*i<=n;i++){
if (n%1==0) return false;
}
return true;
}
public static void main(String [[]args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
Solution sol = new Solution();
Boolean result = sol.isPrime(num);
System.out.println(result);