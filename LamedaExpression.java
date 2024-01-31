@FunctionalInterface
interface F{
    void show(int i);
}

@FunctionalInterface
interface D {
    int  add(int i , int j );
}

public class LamedaExpression {
    public static void main(String[] args) {
        // F obj = new F(){

        //     public void show(int i){
        //         System.out.println("In A show " +i);
        //     }
        // };
        //     // Or use the lameda expression which use in only functional interface
        //     F obj1 = (i) -> {
        //         System.out.println("We ar lameda function with mathod show " +i);

        //     } ;
        //     //or 
        //     F obj2 = i -> System.out.println("We ar lameda function with mathod by single line show " +i);
            
        //     obj.show(3);
        
        //     obj1.show(5);
        //     obj2.show(3);

        // ========For two parameter function ===========

D  dd = (i , j)-> i+j ;
System.out.println(dd.add(4, 8));

    }}

