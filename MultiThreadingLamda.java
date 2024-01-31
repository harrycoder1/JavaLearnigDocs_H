class Counter {
    int count =0;
    //synchronized this keyword help to define individualy
    public synchronized void increament() {
        this.count++;
    }
}

public class MultiThreadingLamda {
    public static void main(String[] args) throws InterruptedException {

        Counter cc = new Counter() ; 
        Runnable obj1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    cc.increament();
                }
            }
        };

        Runnable obj2 = () -> { // by lamda function
            for (int i = 0; i < 10000; i++) {
                cc.increament();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();

        t2.start();
        // due to the join we are able to see right value here
        t1.join();
        t2.join();
    System.out.println(cc.count);
    }
}
