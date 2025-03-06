package StringBuffer;

public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("olleH");
        StringBuffer sb1 = new StringBuffer("olleH");
        System.out.println(sb.capacity());
        System.out.println(sb.reverse().append("Rushabh"));
        System.out.println(sb.reverse().append( 143));
        System.out.println(sb1.reverse().append( 143));
        System.out.println(sb.charAt(1));
        System.out.println(sb.length());
    }
}
