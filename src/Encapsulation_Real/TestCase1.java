package Encapsulation_Real;

//Single Inheritance
public class TestCase1 extends BaseClass {

    //Default constructor
    public TestCase1(){
        super();   // call Parent constructor in future - super - means parent
        //this - current object
        System.out.println("DC - TC1");
    }

    //Function

    public void startTestCase(){
        openBrowser("chrome");
        closeBrowser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {

        System.out.println("Own Logic");      //child
        super.setBrowser(browser, isAuth);   // super = baseclass --parent constructor
    }

    @Override
    public String toString(){
        return "TestCase1{}";
    }
}
