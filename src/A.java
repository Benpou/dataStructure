public class A {
    public static void main(String[] args) {
        B b = new B("behnam");
        b.print();
    }
}

class B {
    String s;

    B(String news) {
        s = news;
    }

    public void print() {
        System.out.print(s);
    }
}
