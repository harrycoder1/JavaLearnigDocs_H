enum Laptop21{
    MacBook(2000) , HP(1500) ,MyLapi1 ,  Dell(1400) , GooglePixel(2321231) ; 
    private int price ; 

    // make default constructor 
    private Laptop21 (){
        this.price = 0 ;
    }
        private  Laptop21(int price){
        this.price = price ;
    }
    public int getPrice(){
        return price ;
    }
}
public class EnumJ2 {
    public static void main(String[] args) {
        
        Laptop21 lap = Laptop21.MacBook ;
System.out.println(lap.getPrice());
for (Laptop21 lap1 : Laptop21.values()) {
    System.out.println(lap1 +" : "+lap1.getPrice());
    
}
    }
}
