import java.util.Scanner;

public class T8this {
    public static void main(String[] args) {
        B aa = new B(3) ;

    }
}
class A extends Object  //by defualt extends the object class
{ 
    public A(){
        System.out.println("Im in A");
    }
}

class B extends A{
    public B(){
        System.out.println("Im in B");
    }
    public B(int a)
    {
        this() ; 
        System.out.println("I am in int B");
    }
}
