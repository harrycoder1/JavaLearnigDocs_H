class Calculator{
    int a ;
    public int add(int a , int b){
        return a+b ;
    }
}
public class T6class {
    public static void main(String[] args) {
        int a=2 , b=8;
Calculator dd = new Calculator() ;
System.out.println(dd.add(a, b));
        System.out.println(a+b);
    }
}
