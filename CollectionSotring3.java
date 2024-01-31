import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student23{
    Integer age ; 
    String name ;
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    public Student23(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
    
}
public class CollectionSotring3 {
    public static void main(String[] args) {


// Comparator<Integer> com = new Comparator<Integer>() 
// {
//     public int compare(Integer i , Integer j )
//     {

//         if(i%10>j%10)
//             return 1 ; 
//         else return -1 ;
//     }
// };

//         List<Integer> nums = new ArrayList<>() ;
//         nums.add(23);
//         nums.add(2);
//         nums.add(111);
//         nums.add(14);
//         // Collections.sort(nums);
//         Collections.sort(nums , com);
//         System.out.println(nums);

List<Student23> stus = new ArrayList<Student23>() ;
stus.add(new Student23(21, "harish"));
stus.add(new Student23(121, "Virat"));

stus.add(new Student23(26, "BhimRao"));


// for sort 
Comparator<Student23> com = (i , j)-> i.age >j.age ?1:-1 ;
System.out.println(stus);

for (Student23 student23 : stus) {
System.out.println(student23);
}

Collections.sort(stus , com);

System.out.println("Sorted  is :");

for (Student23 student23 : stus) {
    System.out.println(student23);
    }
    }
}
