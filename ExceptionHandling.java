public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 1 ;
        int j=0 ;
int nums[] = new int[5];

        try {
            j= 18/i ; 

            System.out.println(nums[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
 System.out.println("Lenth is small of your Array ");
        }
        catch(ArithmeticException e){
            System.out.println("Airthematic exception found here");
        }
        catch(Exception e){
            System.out.println("SomeThing Went Wrong "+e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
