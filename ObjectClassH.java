class Laptop extends Object
{
    int price ; 
    int marks ;
    
    @Override
public String toString(){
    return "Hey" ;
}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + marks;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (marks != other.marks)
            return false;
        return true;
    }

}
public class ObjectClassH {
    public static void main(String[] args) {
        Laptop leneo = new Laptop() ;
        leneo.price = 100 ;
        leneo.marks = 22 ; 
        System.out.println(leneo); 
        Laptop leneo2 = new Laptop() ;
        leneo2.price = 100 ;
        leneo2.marks = 21 ; 
        System.out.println(leneo2.equals(leneo));
    }
 
    
}
