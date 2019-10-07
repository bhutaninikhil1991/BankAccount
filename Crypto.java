public class Crypto{
    private String cipherKey = "zyxwvutsrqponmlkjihgfedcba";
    String phrase="cat dog";

    public static void main(String args[])
    {
        Crypto crpto = new Crypto();
        System.out.println(crpto.generateCrypto());
    }
    
    public StringBuilder generateCrypto()
    {
        StringBuilder sb = new StringBuilder();
        int i=0;
        for (Character ch : phrase.toCharArray()) {
            if(Character.isLetter(ch) && (ch >= 'a' && ch <= 'z'))
            {
                i = (int)ch - (int)'a';
                System.out.println(i);
            }
            sb.append(cipherKey.charAt(i));
        }
        return sb;
    }
}