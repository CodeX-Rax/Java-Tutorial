package ThreadAndMultiThreading;

public class ThreadSetPriority extends Thread{

    public ThreadSetPriority(String name) {
        super(name);//to change thread name
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " - Priority : " + Thread.currentThread().getPriority() + " -Count : " +  i);
            try{
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSetPriority obj1=new ThreadSetPriority("Low priority thread");//given thread name
        ThreadSetPriority obj2=new ThreadSetPriority("Mid priority thread");
        ThreadSetPriority obj3=new ThreadSetPriority("High priority thread");
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.NORM_PRIORITY);
        obj3.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
