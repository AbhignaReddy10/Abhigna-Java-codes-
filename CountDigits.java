//Aim: To count the digits in the given number
import java.util.Scanner;
class CountDigits{
    int countdig (int x){
        int res=0;
        while (x>0){
            x=x/10;
            res++;
        }
        return res;
        }
        public static void main(String aregs[]){
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            CountDigits cd = new CountDigits();
            int digs = cd.countdig(n);
            System.out.println(digs);
        }
    }
