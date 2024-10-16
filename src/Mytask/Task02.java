package Mytask;
//Find max number using array
public class Task02 {
    public static void main(String[] args) {
        //Declare Array
        int[] array = {25,28,55,66,77,89,100,18};

        //New variable for 4th type function and function call
        int maximum = maxfun(array);
        System.out.printf("Max value is %d",maximum);
    }
    //With return type and parameter
    static int maxfun(int [] array){
        int max = array[0]; //Here we take another variable for reference = 25
        for(int i = 0;i<array.length;i++) //loop
        {
            if(array[i]>max)  //condition
                max = array[i];
        }
        return max;
    }
}
