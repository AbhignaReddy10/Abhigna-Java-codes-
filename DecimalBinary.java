
    import java.util.Scanner;
public class DecimalBinary
{
public static String toBinary(int decimal)
{
return Integer.toBinaryString(decimal);
}
public static void main(String[] args)
{
Scanner scanner= new Scanner(System.in);
System.out.print("enter decimal");
int decimal=scanner.nextInt();
System.out.println("binary" + toBinary(decimal));
scanner.close();
}
}





