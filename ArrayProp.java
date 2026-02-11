//Aim: to learn about arrays and their properties.
import java.util.Scanner;
public class ArrayProp{
// create an array.
public static void main(String []args){
String [] names = {"Abhi","Kam","deekistha"};
System.out.println(names[0]);
System.out.println(names[1]);
System.out.println(names[2]);

// change the array element.
names[2] ="Kasula";
System.out.println(names[2]);
// create the array using new keyword
String [] subs = new String[3];
subs[0] = "CSA";
subs[1] = "CN";
subs [2]= "WSE";
for(int i =0; i<3; i++){
System.out.println(subs[i]);
}
}
}