package Polymorphism.MethodOverloading;

public class test1 {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(3,4);
        System.out.println(result);
    }
}
class MathOperations{
    int add(int a, int b){
        return a+b;
    }
}