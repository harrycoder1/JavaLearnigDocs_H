import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryingFInaly {
    public static void main(String[] args) throws IOException {
        BufferedReader br ; 
        // try{
        //    br = new BufferedReader(new InputStreamReader(System.in)) ; 
        //    int n = Integer.parseInt( br.readLine() );
        // }

        // finally{
        //     br.close();
        //     System.out.println("I know iam run");
        // }

        // OR 
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){ //it will close the resourses manually this is also known as try with block
            int n1 = Integer.parseInt( bf.readLine() );
        }
    }
}
