package Encapsulation;

public class Lab153 {

    public static void main(String[] args) {
        person p1 = new person("p","123");
        p1.getName();
        p1.setName("piyush");
        //p1.name
        //p1.phone_no    - not directly access - encapsulation
    }
}

//rule 1: should be private in nature to encapsulate
class  person{
    private  String name;
    private  String phone_no;

// rule 2: generate constructor
    public person(String name, String phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    }

    //rule3: made private in nature usinf getter-setter - encapsulated class

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}
