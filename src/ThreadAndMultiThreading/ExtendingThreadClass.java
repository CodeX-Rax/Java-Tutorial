package ThreadAndMultiThreading;

class A extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("In A : " + Thread.currentThread().getName());
        }
    }
}
public class ExtendingThreadClass {
    public static void main(String[] args) {
        A a=new A();
        a.start();//To start run() in Thread class, we need to use start() to call run()
        for (int i=0;i<100;i++){
            System.out.println("In main : " + Thread.currentThread().getName());
        }












        // System.out.println(Thread.currentThread().getName());//used to get name of main Thread
    }
}
