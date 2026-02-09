//Aim : to write a java program which takes Celsius in input and converts  it into farenheit.
import java.util.Scanner;
class TempCtoF {
    public double cToF(int C) {
        
        double f = (C*9/5)+32;
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int Ce = sc.nextInt();
        TempCtoF sol = new TempCtoF();
        double result = sol.cToF(Ce);
    }
}


