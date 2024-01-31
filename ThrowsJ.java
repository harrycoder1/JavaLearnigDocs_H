class A4{
    public void show() throws ClassNotFoundException{
        // try{
            Class.forName("ThrowsJ1") ;
        // }catch(ClassNotFoundException e){
        //     System.out.println("Np class found here .");
        // }
    }
}

public class ThrowsJ {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        
        A4 obj = new  A4();
        
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
