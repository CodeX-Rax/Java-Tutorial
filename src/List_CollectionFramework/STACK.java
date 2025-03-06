package List_CollectionFramework;

import java.util.Stack;

public class STACK {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        //Feactures
        //push()
        //pop()
        //peek() - usse element dekhte hai
        stack.push(1);//5
        stack.push(3);//4
        stack.push(32);//3
        stack.push(11);//2
        stack.push(2);//1
        System.out.println(stack);
        System.out.println(stack.peek());//to see top
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.lastElement());
        System.out.println(stack.search(2));
    }
}
