package OOPs_inheritance;

public class SI_1 {
    public static void main(String[] args) {
        //Single Inheritance
        //Son will get the attributes from Father.
        //1 son and 1 father

        Son s1 = new Son();
        System.out.println(s1.gold);
        s1.bhk3();
        s1.bhk2();
        Father f1 = new Father();
        //f1.bhk3(); Father has not extended

    }
}
