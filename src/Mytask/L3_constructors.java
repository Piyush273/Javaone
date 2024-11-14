package Mytask;

import java.util.Scanner;

public class L3_constructors {
    public static void main(String[] args) {

        //Enter Input
        Scanner sc = new Scanner(System.in);

       /* car3 t3 = new car3("tesla",2015);
        System.out.println(t3.year);
        System.out.println(t3.model);
        t3.display();

        car3 t4 = new car3("swift",2017);
        System.out.println(t4.year);
        System.out.println(t4.model);
        t4.display();*/

        System.out.println("ENter the model name");
        String model_name_input = sc.next();

        System.out.println("ENter the year");
        int year_input = sc.nextInt();

        car3 t5 = new car3(model_name_input,year_input);
        System.out.println(t5.year);
        System.out.println(t5.model);
        t5.display();


    }
}
 //Define another class and variable
class car3{
    String model;
    int year;

    //Parameterized constructor
    car3(String model_name,int year_created)
    {
        System.out.println("PC");
        this.model = model_name;
        this.year = year_created; // this is used for access variable
    }
    void display(){
        System.out.println("car3 Details ->" +this.model+"-"+this.year);
    }
}
