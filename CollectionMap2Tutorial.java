import java.util.*;

public class CollectionMap2Tutorial {
    public static void main(String[] args) {
    // Map<String , Integer> student = new HashMap<>() ;     
    Map<String , Integer> student = new Hashtable<>() ; // it dont need to add snchronized   externally   
    student.put("Harish", 32) ;
    student.put("Akashy", 21) ;
    student.put("Aditya", 20) ;

    student.put("Akashy" , 45);
    System.out.println(student);
    System.out.println(student.get("Harish"));
    System.out.println(student.keySet());
    System.out.println(student.values());

    for (String name : student.keySet()) {
        System.out.println(name +" : "+student.get(name));
    }

    }
}
