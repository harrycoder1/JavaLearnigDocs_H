class A33{
    public void show(){
        System.out.println("In new Show");
    }
}

abstract class Car {
    abstract public void ride();
}
public class AnyomousClassJ {
    
    public static void main(String[] args) {
        A33 a = new A33() { // annoymus class 
            public void go(){
                System.out.println("Im going");
            }
        } ;

        Car s = new Car() {
            public void ride(){
                System.out.println("Riding Start");
            }
        };
        s.ride();
        a.show();
    }
}
