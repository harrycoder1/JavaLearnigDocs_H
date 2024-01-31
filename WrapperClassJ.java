public class WrapperClassJ {
    public static void main(String[] args) {
        int num = 7 ;
        Integer n = new Integer(23) ; //bad way
        Integer a = 5 ; //good way

        String str = "12" ; 
        int n1 = Integer.parseInt(str);

        System.out.println(n1);
        System.out.println(n);
        System.out.println(a);
    }
}
