import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferdJ {
    public static void main(String[] args)  throws IOException{
        System.out.println("Enter the Number :");


        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num  =Integer.parseInt( bf.readLine()) ; 
        System.out.println("the enterd number is " + num);
        bf.close();
    }
    
}
