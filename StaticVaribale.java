class Mobile{
    int price ; 
    String brand ;
    static String  type ; 
static{
    type = "SmartPhone" ;
    System.out.println("Static excute");

}

    public Mobile(){
        //it will execute at the time of creation of object
        price =2222 ;
        brand ="Apple" ;
        System.out.println("constructor execute ");
    }

    public static void detail(){
System.out.println("Im static method " +type);
    }
public static void data(Mobile obj){
    System.out.println("THe detail is "+ obj.price + " "+obj.brand);

}
}
public class StaticVaribale {
    public static void main(String[] args) throws ClassNotFoundException{
        Mobile ss  =new Mobile() ;
        // Mobile ss1  =new Mobile() ;


        Class.forName("Mobile"); //it will excute only static 

        Mobile.detail();
        Mobile.data(ss);
    }
}
