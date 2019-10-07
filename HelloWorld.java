/**
 * Hello World
 */
public class HelloWorld {

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("abc");
        StringBuilder sb2= new StringBuilder(sb);
        StringBuilder sb3=sb;
        sb2.append("d");
        sb3.setCharAt(2,'x');
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb3);

    }
}