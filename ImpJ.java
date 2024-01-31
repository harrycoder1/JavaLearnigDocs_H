import java.io.IOException;

public class ImpJ {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number :");
      int n =   System.in.read() ; //it give the Ascii Value of the input
      System.out.println(n);
      System.out.println(n-48);
      System.out.println((char)n);
    }
    
}
