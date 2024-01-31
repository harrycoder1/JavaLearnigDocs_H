
class HarishException extends Exception {
    public HarishException(String s){
        super(s);
    }
}
public class ExceptionThrow {
    public static void main(String[] args) {
        int i = 0 ; 
        int j=0 ;
    try{
        // if(i==0) {
        //     throw new ArithmeticException("I dont want to divid with zero bro") ;

        // }
        // j = 18/i ;
     //============my own exception
     if(i==0){
        throw new HarishException("I dont want do do anything") ;
     }

    }
    catch(HarishException e){

System.out.println("Hi , "+e);
    }
    catch(ArithmeticException e){
        j = 18/1 ;

        System.out.println("Error are occured "+e);

    }

    System.out.println(j);
    
    }
}
