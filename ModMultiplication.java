//Aim: to perform modulus after  multiplication.
import java.util.Scanner;
class ModMultiplication {
    public int modmul(int a, int b, int M) {
        // code here
        int mul = a*b;
        int result = mul%M;
        return result;
    }
    public static void main(String  [] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int M = sc.nextInt();
        Solution sol = new Solution();
        sol.modmul(a,b,M);
    }
    
}