package basics;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {

        // POJO : plain old java object:
        Student stu1 = new Student(); //  object-creation:
        System.out.println("roll number is : " + stu1.getRollNumber());
        int rollNumber;
        String name, address;
        List<Integer> marks = new ArrayList<>();

        rollNumber = 123;
        name = "ramesh";
        address = "karrapur";
        marks.add(89);
        marks.add(67);
        marks.add(60);
        marks.add(90);
        marks.add(98);

        // setting values to properties of class student:
        stu1.setRollNumber(rollNumber);
        stu1.setStudentName(name);
        stu1.setStudentAddress(address);
        stu1.setMarks(marks);


        String msg = stu1.introduction();
        System.out.println(msg);




    }
}
