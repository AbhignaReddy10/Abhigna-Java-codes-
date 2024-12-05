import java.io.*;
class Formatting {
public static void main (String [] args)
{
int number = 4200000;

System.out.printf("Default: %d%n", number);
System.out.printf("Padded with zeroes: %04d%n", number);
System.out.printf("Comma separated: %,d%n",number);
System.out.printf("Hexadecimal: %x%n", number); // Output: 2a
System.out.printf("Octal: %o%n", number);       // Output: 52

}
}