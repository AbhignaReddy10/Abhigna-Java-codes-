// Java Program for taking user
// input using BufferedReader Class
import java.io.*;

class GFG {

    // Main Method
    public static void main(String[] args)
        throws IOException
    {
        // Creating BufferedReader Object
        // InputStreamReader converts bytes 
        // stream of character
        BufferedReader bfn = new BufferedReader(
            new InputStreamReader(System.in));

        // String reading internally

        String str = bfn.readLine();

        // Integer reading internally
        int it = Integer.parseInt(bfn.readLine());

        // Printing String
        System.out.println("Entered name : " + str);

        // Printing Integer
        System.out.println("Entered age : " + it);
    }
}
