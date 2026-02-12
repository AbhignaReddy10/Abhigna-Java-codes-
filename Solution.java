//aim: this program gives modulos of addition 
import java.util.Scanner;
class Solution {
    public static int sumUnderModulo(int a, int b, int M) {
       int sum=0;
        
         sum = a+b;
         return sum%M;
         
    
        
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        
        int sol = sumUnderModulo(A,B,M);
        
    }
}
