class Student{
    String name ;
    int roll ;
    int mark ;
}

public class Array2 {
    public static void main(String[] args) {
       Student ss = new Student() ;
       ss.name = "harish" ;
       ss.roll = 12;
       ss.mark = 40 ; 

       Student ss2 = new Student() ;
       ss2.name = "Vir" ;
       ss2.roll = 102;
       ss2.mark = 20 ; 

       Student arr[] = new Student[2] ;
       arr[0] = ss ;
       arr[1] = ss2 ;
for (Student s :arr) {
    System.out.println(s.name);
}
       System.out.println(ss);
    }
}
