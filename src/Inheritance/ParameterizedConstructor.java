package Inheritance;


class A{
    int rollNo;
    String name;
    int age;
    public A(int rollNo,String name,int age) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }

}
public class ParameterizedConstructor {
    public static void main(String args[]){
        A a=new A(11,"rushabh",32);
        System.out.println(a.getAge());
        System.out.println(a.getName());
        System.out.println(a.getRollNo());

    }
}
