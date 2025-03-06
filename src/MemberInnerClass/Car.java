//Member Inner Class -it is type of inner class only
package MemberInnerClass;

public class Car
{
    private String model;
    //member Variable
    private boolean isEngineOn;
    public Car(String model){
        this.model=model;
        this.isEngineOn=false;
    }
    //member inner class
    class Engine{
        void start(){
            if(isEngineOn){
                isEngineOn=true;
                System.out.println(model + " Engine Started !");
            }else {
                System.out.println(model + " Engine is already on! ");
            }

        }
        void stop(){
            if (isEngineOn){
                isEngineOn=false;
                System.out.println(model + " Engine Stopped !");
            }else {
                System.out.println(model + " Engine is already off !");
            }
        }
    }


}
