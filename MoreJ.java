/**
 * MoreJ
 */

 abstract class Computer {
    public abstract void code() ;
 }

 class Laptop1 extends Computer{
public void code(){
    System.out.println("You are code by laptop");
}
 }

 class DeskStop1 extends Computer{
    public void code(){
        System.out.println("You are code by DeskStop");
    }
     }
 class Developer{
    void code(Computer cc){

        cc.code();
    }
 }

public class MoreJ {

    public static void main(String[] args) {
        Computer lap = new Laptop1() ;
Computer desk = new DeskStop1() ;

Developer dev1 = new Developer() ; 

dev1.code(desk);
dev1.code(lap);

    }
}