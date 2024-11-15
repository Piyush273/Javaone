package Polymorphism.MethodOverriding;

public class test2 {
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();
    }

}

class Dog{
    void bark(){
        System.out.println("I am dog, i will bark!!");
    }
    int age = 10;
}

class Hound extends Dog{
    //Hound is type of dog

    //@Override
    void bark(){
        System.out.println("Bark of Hound");
    }
}

//Here we use two bark function so latest one function is overriding