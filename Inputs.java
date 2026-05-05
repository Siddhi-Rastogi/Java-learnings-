import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inputs {
    public static void main(String... s) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");
        String input = br.readLine();  // read input as string
        
        int b = Integer.parseInt(input);  // convert to int
        System.out.println("You entered: " );
    }
}
