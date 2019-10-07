import java.util.Scanner;

public class CountChars {
    public static void main(String [] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string:");
        str = scanner.nextLine();
        System.out.println(str.length());
        var temp = str.toCharArray();
        int count = 0;
        for (char var : temp) {
            if (var == 'z'){
               count ++; 
            }
        }
        System.out.println("Character 'z' Occurance in a sentence: "+count);

        int count1 = 0;
        for (char var : temp) {
            if(var >= 'A' && var <= 'Z'){
                count1++;
            }
            else if (var >= 'a' && var <= 'z'){
                count1++;
            }
        }
        System.out.println("Number of letters in a sentence: "+count1);

        int count2 = 0;
        for (char var : temp) {
            if(Character.isLetter(var))
            {
                count2++;
            }
        }
        System.out.println("To identify letters in a sentence: "+count2);

        int count3 = 0;
        for (char var: temp){
            if (var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u'){
                count3++;
            }
        }
        System.out.printf("Number of vowels in a sentence are: %d\n", count3);

        String vowels = "aeiou";
        int count4=0;
        for (char var : temp) {
            if(vowels.indexOf(var) > 0)
            {
                count4++;
            }    
        }
        System.out.println("The number of vowels using String.indexOf() are: " + count4);
        
        StringBuilder sb = new StringBuilder();
        for (Character ch : temp) {
          if(ch != ' ')
              ch='*';
            sb.append(ch);
        }
  
        System.out.println("The password is: " +sb.toString());
    }
}