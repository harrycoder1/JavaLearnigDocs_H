import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTutorial2 {
    public static void main(String[] args) {
        List<Integer> ns = Arrays.asList(2,3,4,5,9,11) ;
        
    //     Stream<Integer> s1 = ns.stream() ;  //we can use at once for one object
    //    Stream<Integer> s2 =  s1.filter(n -> n%2==0) ; //for filter the value
    //    Stream<Integer> s3 = s2.map(n->n*2) ; //for doulbe the value

    //    int result = s3.reduce(0, (c,e)->c+e) ; 

    //    System.out.println(result);
    //    s3.forEach(n->System.out.println(n));


    // create the predicate object for filter 
    Predicate <Integer> p = new Predicate<Integer>() {
       @Override
        public boolean test(Integer t){
            return t%2==0 ;
        }
    };
// or
Predicate <Integer> pp = ( i)->i%2==0 ;


// for  map function
Function<Integer ,Integer> ff = new Function<Integer,Integer>() {
   public Integer apply(Integer t){
return t*2 ;
    }
};
// or 
Function <Integer , Integer> f1 = i-> i*2 ;
    // Shorttircks
int res = ns.stream() .filter(n->n%2==0)  .map(n ->n*2) .reduce(0, (c,e)->c+e);
// or
int res1 = ns.stream() .filter(pp)  .map(ff) .reduce(0, (c,e)->c+e);


// for sort 
Stream <Integer> sortedValue = ns.stream().sorted() ;

// System.out.println(sortedValue);
sortedValue.forEach(i->System.out.println(i));
System.out.println(res);
System.out.println(res1);
    }
}
