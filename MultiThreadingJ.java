class A6 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++)  {

        System.out.println("Hi");
        try{
            Thread.sleep(100);

        }
        catch(InterruptedException e){

        }

        }
    }
}
class B6 extends Thread{ 
    public void run(){
        for (int i = 0; i < 100; i++) {
        System.out.println("hello");
        try{
            Thread.sleep(100);

        }
        catch(InterruptedException e){

        }  
        }
    }
}

// or 
class W implements Runnable {
    
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("Run by W");

            try {
            Thread.sleep(2);
                
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }

    }
}

class R implements Runnable {
    
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("Run by R");

            try {
            Thread.sleep(2);
                
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }

    }
}

public class MultiThreadingJ {
    public static void main(String[] args) {
        // A6 obj1 = new A6() ;
        // B6 obj2 =new B6() ;
        
        // obj2.setPriority(7) ; 
        // obj1.start();
        // obj2.start();

        //Or runable 
        Runnable  r1 = new R() ; 
        R  r2 = new R() ; 

        Thread t1  = new Thread(r1) ;
        Thread t2  = new Thread(r2) ;

        t1.start();
        t2.start();

    }
}
