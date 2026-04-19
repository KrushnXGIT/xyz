import java.lang.Thread.*;

import static java.lang.Thread.sleep;

class A implements Runnable{
    /**
     *
     */
    @Override
    public void run()  {
        for(int i = 0;i<5;i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello");
        }
    }
}

class call{
    public static void main(String[] args) {
        A r = new A();
        Thread t= new Thread(r);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("hecko");
        }
    }
}//