enum Status {
    Progress , Faild , Success , TimeOut , Pending ;
}

public class Enumj {
public static void main(String[] args) {
    
    int i =5 ; 
    Status s = Status.Success ;
    System.out.println(s);
    System.out.println(s.ordinal());
    Status[] ss = Status.values() ;
for(Status e :ss){
    System.out.println(e);
}

Status asa = Status.Faild ;

if(asa == Status.Faild){
System.out.println("your proccess has been faild");
}

switch (asa) {
    case Progress:
        System.out.println("Pleas Wait...");
        break;
    case Success :
    System.out.println("You can EWxistr now");
    break ;

    default:
    System.out.println("i dont know  What are you doing ");
        break;
}


System.out.println(asa.getClass().getSuperclass());

}
}
