import java.util.*;
import java.util.function.Consumer;

public class StreamTutorial {
    public static void main(String[] args) {
        List<Integer> nums2= Arrays.asList(1,2,3,34,4)  ; 


        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer nb){
                System.out.println(nb);
            }
        };

        // OR
        Consumer<Integer> com = (nb)-> System.out.println(nb);
      
        // =========for printing the value in better way 
        // nums2.forEach(n-> System.out.println(n)) ;
        nums2.forEach(con) ;
        System.out.println(nums2);
    }
}
