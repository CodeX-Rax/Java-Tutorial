package ThreadAndMultiThreading;

public class StatesOfThreads extends Thread {
    @Override
    public void run() {
        System.out.println("Running");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        StatesOfThreads t1=new StatesOfThreads();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());


    }
}
