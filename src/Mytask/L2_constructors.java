package Mytask;

public class L2_constructors {
    public static void main(String[] args) {
        Car2 t1 = new Car2("tesla",2015);
    }
}

class Car2{
    String model;
    int year;

    //Parameterized constructor
    Car2(String model,int year)
    {
        System.out.println("PC");
    }
}
