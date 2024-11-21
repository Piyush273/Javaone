package Encapsulation_Real;

public class BaseClass {    //baseclass is common class - like ground floor
    //Encapsulation
    private String browser;   //Instance variable

    //Default constructor
    BaseClass() {
        System.out.println("DC - BaseClass");
    }

    //Parameterized constructor
    BaseClass(String b) {
        System.out.println("CC - BaseClass");
    }

    //getter setter
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {               //For authentication
            this.browser = browser;
        } else {
            System.out.println("Not Allowed");
        }
    }
 //functions
    public void openBrowser(){
        System.out.println("Opening Browser!!");

      /*  WebDriver driver = new ChromeDriver();
        driver.get("url");*/
    }
     //Polymorphism
    //Method overloading - same name with different argument

    void openBrowser(String browserName){
        System.out.println("Open Browser!! ->" + browserName);
    }

    void closeBrowser(){
        System.out.println("Closing Browser!!");
    }





}
