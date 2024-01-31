interface A111{ //it is default public and abstract
    int age = 3  ;  //default final and Static
    void code(); //by default abstract

}

class B11 implements A111 {
  public  void code(){
System.out.println("Codding");
    }
}
public class InterfaceJ {
    public static void main(String[] args) {
        System.out.println(A111.age) ;
        A111 s = new B11() ;
        s.code();
    }
}
