package StaticInnerClass;

public class Test {
    public static void main(String args[]){
        Computer computer=new Computer("Hp","ABC","Windows");
        computer.getOs().displayInfo();

        Computer.USB usb=new Computer.USB("tYPE-C");
        usb.displayInfo();


    }
}
