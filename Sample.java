import java.util.Scanner;

public class Sample {
    public static void main(String args[]) {
        String s1="abcd";
        String s2="abc";
        System.out.print("please enter abc:");
        Scanner scanner = new Scanner(System.in);
        String s3=scanner.nextLine();
        if (s1==s2) {
            System.out.println("s1,s2 SAME with ==");
        }
        if (s1.equals(s2)) {
            System.out.println("s1,s2 SAME with equals");
        }
        if (s1==s3) {
            System.out.println("s1,s3 SAME with ==");
        }
        if (s1.equals(s3)) {
            System.out.println("s1,s3 SAME with equals");
        }
    }
}
