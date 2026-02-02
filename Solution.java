import java.util.Scanner;
class Solution{
    public int Absolute(int n){
        if (n<0){
            return -n;
            
        }else{
            return n;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int IN = sc.nextInt();
            Solution sol = new Solution();
            int result = sol.Absolute(IN);
            System.out.println(result);
        }
    }
}

