package Enums;
//Enum is class in java in which we can make instances and use it afterword
public class Test {
    public static void main(String[] args) {
        System.out.println(Day.THURSDAY);//ye use hone ke bad iska colour change ho jate hai

        //operaions on monday
        Day monday = Day.MONDAY;//class object=class.instance
        int ordinal = monday.ordinal();//ordinal() is used to give index of instances.
        System.out.println(ordinal);
        System.out.println(monday.name().toLowerCase());//name() is used to give string //and toLowerCase() is used to give name() in lowercase

        Day[] values=Day.values();//values() is used to print all instance as it is.
        for (Day i: values){
            System.out.println(i);
        }


    }
}
