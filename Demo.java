import java.util.*;

public class Demo {
  public static void main(String[] args) {
    List <Integer> aa = Arrays.asList(2,2,3,4,3) ;
//  aa.stream().filter(i->i>2);
aa.stream() .filter(n->n>2).map(i->(i)).forEach( i-> System.out.println(i)); 

  }  
}
