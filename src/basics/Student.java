package basics;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Student {
    // properties/ features/ fields:

    private int rollNumber;
    private String studentName;
    private String studentAddress;
    private List<Integer> marks = new ArrayList<>();

    // constructors: (3 types)
    // non-parim/no-args-const:

    public Student() {}

    // all-parim/all-args-const:




    public Student(int rollNumber, String studentName, String studentAddress, List<Integer> marks) {
        setRollNumber(rollNumber);
        setStudentName(studentName);
        setStudentAddress(studentAddress);
        setMarks(marks);
    }

    // getter methods:
   public int getRollNumber()
    {
        return  rollNumber;
    }
   public String getStudentName()
    {
        return studentName;
    }
    public String getStudentAddress()
    {
        return studentAddress;
    }
   public List<Integer> getMarks()
    {
        return marks;
    }

    // setter methods:
   public void setRollNumber(int rollNumber)
    {
        if(rollNumber > 0)
            this.rollNumber = rollNumber;
        else
            System.out.println("invalid roll number.");
//        throw InvalidParameterException (we can throw error/ exception also)
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    // working methods:
    public String introduction()
    {
        String msg = String.format("""
                displaying introduction: 
                name is: %s
                roll number is: %d
                address is: %s
                """, studentName, rollNumber, studentAddress );
        return msg;
    }

    public int average()
    {
        int sum = 0;
        int result;
        for(int mark : marks)
        {
            sum = sum + mark;
        }

        result = sum / marks.size();

        return result;
    }

    // toString method (display object into string form)


    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", marks=" + marks +
                '}';
    }
}




