package Encapsulation_part2;

import Encapsulation_Real.BaseClass;
import Encapsulation_Real.TestCase1;

public class AccessModifier {   //Access Encapsulation_real class
    public static void main(String[] args) {
        BaseClass tc1 = new TestCase1();      //Access baseclass
        tc1.setBrowser("chrome", true);
        tc1.openBrowser();

        TestCase1 tc2 = new TestCase1();     //Access testcase 1 fuction
        tc2.startTestCase();

    }
}
//Runnerclass