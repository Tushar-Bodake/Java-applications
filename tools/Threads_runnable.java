class A implements Runnable{

    public void run (){
        for(int i=0;i<=5;i++){

        System.out.println("hii");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }
    
}

class B implements Runnable{

    public void run (){
        for(int i=0;i<=5;i++){

        System.out.println("hello");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }
    
}
public class Threads_runnable {
    
    public static void main(String[] args) {

        Runnable r1 = new A();
        Runnable r2 = new B();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        System.out.println(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        
    }
}
