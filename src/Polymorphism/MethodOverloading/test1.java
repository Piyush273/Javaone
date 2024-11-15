package Polymorphism.MethodOverloading;

public class test1 {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(3,4);
        System.out.println(result);
    }
}

class MathOperation{
    //method overloading - compile time
    //method will be Over load
    //Same name button different Argument or param
}

class MathOperations{
    int add(int a, int b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }

    void add(int a, int b, int c){
        System.out.println("Hello");
    }

    void add(){
        System.out.println("Zero Argument");
    }

    double add(double a, double b,double c){
        return a+b+c;
    }

}