

class Alien1 extends Object{ 
    private final int id ;
private final String  name ;

public String toString() {
return "Name : "+name +"\nId : "+id ; 
}

public Alien1(int id, String name) {
    this.id = id;
    this.name = name;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
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
    Alien1 other = (Alien1) obj;
    if (id != other.id)
        return false;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    return true;
}

public int getId() {
    return id;
}
public String getName() {
    return name;
}




}

// OR 
// By DataCarrier Class
record Alien2 (int id , String Name){


    public Alien2(){
        this(0,"") ;
    }
    // public Alien2(int id ,String Name){
    //     this.id=id;
    //     this.Name = Name ;
    // }

    // OR do this thing in similar way :
    //conical Constractor
    public Alien2{
        if(id==0)
            throw new IllegalArgumentException("Id not be Zero") ;
    }
}

public class RecordClassJ {
    public static void main(String[] args) {
// Alien1 a1 = new  Alien1(1, "harish") ;
// Alien1 a2 = new  Alien1(1, "harish") ; //duplicate
//         System.out.println(a1.getName());
//         System.out.println(a1);
//         System.out.println(a1.equals(a2));

// for reacord
Alien2 a1 = new  Alien2(1, "harish") ;
Alien2 a2 = new  Alien2(1, "harish") ; //duplicate
// Alien2 a3 = new  Alien2() ; 
        // System.out.println(a1.getName());
        System.out.println(a1);
        System.out.println(a1.equals(a2));
//get the value from record class
System.out.println(a2.Name());
System.out.println(a2.id());

    }
}
