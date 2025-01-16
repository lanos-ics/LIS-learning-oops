package basics;

import java.util.ArrayList;
import java.util.List;

public class WorkingStudent extends Student {

        private int salary;


        public WorkingStudent(int rollNumber, String studentName, String studentAddress, List<Integer> marks, int salary)
        {
                super(rollNumber, studentName, studentAddress, marks);
                this.salary = salary;
        }

        public int getSalary() {
                return salary;
        }

        public void setSalary(int salary) {
                this.salary = salary;
        }

        public int annualPackage()
        {
                return salary * 12;
        }

        // method overriding:
        @Override // annotation: (have metadata about particular thing)
        public String toString() {
                return "Student{" +
                        "rollNumber=" + getRollNumber() +
                        ", studentName='" + getStudentName() + '\'' +
                        ", studentAddress='" + getStudentAddress() + '\'' +
                        ", marks=" + getMarks() +'\'' +
                        "salary=" + salary +
                        '}';
        }

}
