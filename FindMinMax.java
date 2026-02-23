// Aim: to find the max and min element in a given array and return them in an array.
import java.util.ArrayList;
import java.util.Scanner;
class FindMinMax {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
     ArrayList <Integer> result =  new ArrayList<>();
     if(arr==null|| arr.length==0){
      return result;
    }
  int min= arr[0];
  int max = arr[0];
  
  for (int i =0;i<arr.length;i++){
      if(arr[i]<min){
          min = arr[i];
      }
      if(arr[i]> max){
          max = arr[i];
      }
  }
  result.add(min);
  result.add(max);
  
  return result;
    }
 public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     
     for (int i =0; i<n;i++){
         arr[i]= sc.nextInt();
     }
 
     Solution sol = new Solution();
     ArrayList<Integer> res = sol.getMinMax(arr);
     System.out.println("Minimum: " + res.get(0) + ", Maximum: " + res.get(1));
 } 
 
}


