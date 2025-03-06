package ThreadAndMultiThreading;

class ABC extends Thread{
    @Override
    public void run() {

    }
}
public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        ABC abc=new ABC();
        for(int i=0;i<10;i++){
            Thread.sleep(3000);
            System.out.println("I'm running...., " );
        }
    }
}
