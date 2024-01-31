
@Deprecated //we used it but dont used it
class A {
public void view(){
    System.out.println("hey Im View");
}
}

// @FunctionalInterface  //it will give  the error t
interface Q{
    void sum();
    void gte();
}
public class MethodOverriding {
    public static void main(String[] args) {
        A ss = new A() ;
    }
    
}
