package basics;

import java.security.InvalidParameterException;
import java.util.List;

public class Student {
    // properties/ features/ fields:

    private int rollNumber;
    private String studentName;
    private String studentAddress;
    private List<Integer> marks;

    // constructors: (3 types)


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

}
