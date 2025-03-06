package Interfaces;

public interface Animal {
    //Interface consist of only abstract method and static constants
    //1st static constant
      //both are same thing in interface  -------->//public static final int ans=150;
                                    //         `-->//int ans=150;
    int max=150;

    //2nd abstract method --jitne bhi method() hum interface me lekhte hai vo sare by default abstract method ban jate hai bina koi notation eg:line no 11 and 12 have same meaning
    public abstract void eat();
    void sleep();

    //3rd static methode-used to tell function or work of that interface
    public static void info(){
        System.out.println("this is function of this interface");
    }
}
