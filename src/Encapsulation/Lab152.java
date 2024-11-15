package Encapsulation;

public class Lab152 {
    public static void main(String[] args) {
        Login login = new Login("admin","password123");
        System.out.println(login.password);
        login.password = "hacker"; // change the password - security breach
        System.out.println(login.password);

        newLogin newlogin = new newLogin("newusername","pwd123");
        /*System.out.println(newlogin.password); //becauseb private in nature
        newlogin.password = "pass123";*/


    }
}

class Login{
    public  String username;
    public  String password;

    //parameterized constructor
    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }
     }


class newLogin{
    private  String username;
    private  String password;

    // Generate constructor on right click

    public newLogin(String username, String password) {
        this.username = username;
        this.password = password;
 }

}


//Use give me password for accessing private