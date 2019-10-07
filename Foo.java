public class Foo {
    int x;
    float f;
    public Foo (int x, float f) {
        this.x=x;
        this.f=f;
    }
    public static void main(String args[]) {
        Foo foo1 = new Foo(3, 3.2f);
        Foo foo2 = new Foo(3, 3.2f);
        Foo foo3=foo2;
        if (foo1 == foo2) {
            System.out.println("foo1 and foo2 are ==");
        }
        if (foo1.equals(foo2)) {
            System.out.println("foo1 and foo2 equals");
        }
         if (foo2 == foo3) {
            System.out.println("foo2 and foo3 are ==");
        }
        System.out.println(foo1.toString());
        System.out.println(foo2.toString());
        System.out.println(foo3.toString());
    }
 }
 