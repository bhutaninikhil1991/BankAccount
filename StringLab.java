import java.util.Scanner;
public class StringLab {

    public static void main (String args[]) {

        System.out.println("enter a string:");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        StringBuilder sb=new StringBuilder(s);
        // replace all occurrences of 'x' with 'y'
        for (int i=0;i<sb.length();i++) {
            char ch = sb.charAt(i);
            if (ch=='x') {
                sb.setCharAt(i,'y');
            }
            else if(ch == 'X')
            {
                sb.setCharAt(i, 'Y');
            }
        }
        System.out.println("main :" + sb);

        StringBuilder sbres = new StringBuilder();
        for (Character ch : sb.toString().toCharArray()) {
            if(Character.isLetter(ch))
            {
                if(ch != 'Z' && ch != 'z')
                    ch = (char)((int)ch + 1);
                else if(ch == 'Z')
                    ch = 'A';
                else if(ch == 'z')
                    ch = 'a';
            }
            
            sbres.append(ch);
        }

        System.out.println("solution 1 :" + sbres.toString());

        // replace all occurrences of 'x' with 'y'
        String res = "";
        for (Character ch : sb.toString().toCharArray()) {
            if(ch == 'x')
                ch = 'y';
            else if(ch == 'X')
                ch = 'Y';

                res += ch;
        }
        System.out.println("Solution 2a:" + res);
        System.out.println("Solution 2b:" + sb.toString().replace('x', 'y').replace('X','Y'));

        String res1 = "";
        for (Character ch : sb.toString().toCharArray()) {
            if(Character.isLetter(ch))
            {
                if(ch != 'Z' && ch != 'z')
                    ch = (char)((int)ch + 1);
                else if(ch == 'Z')
                    ch = 'A';
                else if(ch == 'z')
                    ch = 'a';
            }
            res1 += ch;
        }

        System.out.println("Solution 3 :" + res1);
        
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
             if (ch=='x') { 
                  s=s.substring(0,i)+'y'+s.substring(i+1,s.length());
             }
        }
        System.out.println("Solution 4 :" + s);
    }
}

