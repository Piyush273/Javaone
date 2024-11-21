package Encapsulation;

public class Lab152 {
    public static void main(String[] args) {
        Login login = new Login("admin","password123");
        System.out.println(login.password);
        login.password = "hacker"; // change the password - security breach
        System.out.println(login.password);

        newLogin newlogin = new newLogin("newadmin","pwd123");
        /*System.out.println(newlogin.password); //becauseb private in nature
        newlogin.password = "pass123";*/

        /*String pass = newlogin.giveMePassword(); //add security (function)
        System.out.println(pass);*/

        String pass = newlogin.getPassword(true);
        newlogin.setPassword("hacker123",true); // using setter - add true(isAdmin) >> then only password will be send
        System.out.println(pass);




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
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAdmin) {
        if(isAdmin) {             //condition for password is allowed or not?
            return password;
        }
        return "None";
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin) {
            this.password = password; //condition use in setter password
        }else {
            System.out.println("Not Allowed");
        }
    }
    /*public void setPassword(String password) {
        this.password = password;
    }*/   // you can not set the password using setter

    private  String username;
    private  String password;

    // Generate constructor on right click

    public newLogin(String username, String password) {
        this.username = username;
        this.password = password;
 }
//Use function for accessing private
    public String giveMePassword(){
        return  username;
    }
// add security
    /*public String  giveMePassword(Boolean isAuth){
        if(isAuth){
            return "None";
        }
        return username
    }*/

}

//Generate getter setter by clicking on the string


