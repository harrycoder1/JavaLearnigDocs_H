
class A22{
    int n=1 ; 
    class B22 {
        int m =2 ;

    }
 static   class C22{
        int o =90 ; 
    }
}

public class InnerClassJ {

    public static void main(String[] args) {
        System.out.println(2);
        A22 ss = new A22() ;

        System.out.println(ss.n);
        A22.B22  qq =  ss. new B22() ; //for create the object of inner class
        
A22.C22  cc = new A22.C22() ;
System.out.println(cc.o);

    }

}
