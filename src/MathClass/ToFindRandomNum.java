package MathClass;

public class ToFindRandomNum {
    public static void main(String[] args) {
        int a= (int) (Math.random()*10);//it will give random value 0-9
        System.out.println("From 0 - 9  : "+a);
        int b= (int) (Math.random()*11);//it will give random value 0-10
        System.out.println("From 0 - 10 : "+b);
        float  c= (float) (Math.random()*100);//will give random value from 0-99
        System.out.println("from 0 - 99 : " +c);
        int  d= (int) (Math.random()*100);//will give random value from 0-99
        System.out.println("from 0 - 99 : " +d);

    }
}
