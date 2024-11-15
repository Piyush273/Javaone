package Polymorphism.MethodOverriding;

public class newtest {
    public static void main(String[] args) {
        piyush p = new piyush();
        p.home();

        father f = new father();
        f.home();

        //dynamic dispatch - object is called (object piyush()) and father() object is not valid becoz of the extend
        //WebDriver driver = new ChromeDriver();
        father f1 = new piyush();
        f1.home();
    }
}

class father{
    void home(){
        System.out.println("2BHK");
    }
    void f2(){

    }
}

class piyush extends father{
    //Overriding
    void  home(){
        System.out.println("3BHK");
    }
    void f1(){

    }
}
