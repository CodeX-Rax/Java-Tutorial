package ThreadAndMultiThreading;

class AB implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("In AB  : " + Thread.currentThread().getName());
        }
    }
}

public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        AB ab=new AB();
        Thread thread=new Thread(ab);
        thread.start();
        for (int i=0;i<100;i++){
            System.out.println("In Main : " + Thread.currentThread().getName());
        }
    }
}
