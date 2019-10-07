public class Token {
    private int type;
    private String value;
    public static final int IDTOKEN = 1;
    public static final int INTTOKEN = 2;

    // public Token(int type, String value) {
    //     this.type = type;
    //     this.value = value;
    // }

    @Override
    public String toString() {
        return this.type + " " + this.value;
    }

    /**
     * @param type the type to set
     */
    public void setType(Integer type) {
        if (type == IDTOKEN || type == INTTOKEN) {
            this.type = type;          
        }
        else {
            System.out.println("Invalid value for type");
            System.exit(0);
        }
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || o.getClass() != getClass())
            return false;
        Token token = (Token) o;
        return this.type == token.type && this.value == token.value;
    }

    public static void main(String args[]) {
        Token token1 = new Token();
        token1.setType(IDTOKEN);
        token1.setValue("x");
        Token token2 = new Token();
        token2.setType(IDTOKEN);
        token2.setValue("x");
        Token token3 = token2;

        if (token1 == token2)
            System.out.println("Token 1 and Token 2 are same with ==");

        if (token1.equals(token2))
            System.out.println("Token 1 and Token 2 are same with equals");

        if (token2 == token3)
            System.out.println("Token 2 and Token 3 are same with ==");

        if (token2.equals(token3))
            System.out.println("Token 2 and Token 3 are same with equals");

        if (token1 == token3)
            System.out.println("Token 1 and Token 3 are same with ==");

        if (token1.equals(token3))
            System.out.println("Token 1 and Token 3 are same with equals");

        System.out.println(token1.toString());
        System.out.println(token2.toString());
        System.out.println(token3.toString());

    }
}