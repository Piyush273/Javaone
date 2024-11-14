package Multilevel_inheritance;

public class Multilevel_main {
    public static void main(String[] args) {
        //Function call
        Child c = new Child();
        c.home();  // last one is printed
        c.gf();
        c.f();
        c.c();

        Father f1 = new Father();
        f1.gf();
        f1.f();
        f1.extra();

        Grandfather g1 = new Grandfather();
        g1.gf();
        g1.home();
    }
}
