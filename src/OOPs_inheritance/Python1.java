package OOPs_inheritance;

public class Python1 extends  Programming1 {
    void print(){
        System.out.println("author");
        System.out.println("version");

    }
    Python1(){
        System.out.println("DC");
    }

    public static void main(String[] args) {
        Python1 p1 = new Python1();
        System.out.println(p1.author);
    }
}
