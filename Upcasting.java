
class A12{
    public void show(){
        System.out.println("In SHow A");
    }
}

class B12 extends A12{
    public void show(){
        System.out.println("In SHow B");
    }
    public void go(){
        System.out.println("Im going");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        A12 aa = (A12) new B12() ;
    // aa.show();    
    // aa.going(); //not able to use going becuse of upcasting

    B12 bb =(B12) aa ;
    bb.go();
}
}
