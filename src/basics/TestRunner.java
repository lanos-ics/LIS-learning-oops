package basics;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    public static void findAge(int age)
    {
        if(age < 18)
        {
            throw new IllegalArgumentException("age can not be less then 18"); // crash
        }
        else
        {
            System.out.println("You can vote.");
        }
    }

    public static void main(String[] args)  {
//        int number1, number2, result=0;
//        try {
//            number1 = 123;
//            number2 = 0;
//
//            result = number1 / number2;
//
//        }catch (ArithmeticException e){
//            System.out.println("Exception:" + e.getClass()+
//                    " EXPLAINATION: can not divided by Zero: ERROR: " +
//                    e.getMessage());
//        }finally {
//            System.out.println(result);
//            System.out.println("Execution complete.");
//        }
//        System.out.println("ended!");
//
//
        try {
            findAge(33); // exception
        }catch(IllegalArgumentException e){ // catch the exception to handle it for the shake of user
            System.out.println("you are not eligible for vote due to : " + e.getMessage());
        }

    }
}
