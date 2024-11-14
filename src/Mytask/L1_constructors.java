package Mytask;

public class L1_constructors {
    public static void main(String[] args) {
        //Memory allocation
        Car tesla = new Car();
        System.out.println(tesla.year);
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        //If i'm not using defualt constructor then null value assign

        Car swift = new Car();
        swift.name = "Maruti swift";
        System.out.println(swift.name);

    }
}
