package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationExecution {
    public static void main(String[] args) {
        Student s1 = new Student("Mayur", 1, "CSE");
        Student s2 = new Student("Manav", 1, "CSE");
        Student s3 = new Student("Amit", 1, "EE");
        Student s4 = new Student("Nippun", 1, "ME");
        Student s5 = new Student("Kaushik", 1, "Civil");
        Student s6 = new Student("Harsh", 1, "Architecture");
        Student s7 = new Student("Rohan", 1, "CSE");

        // List of CSE Students
        List<Student> cseStudents = new ArrayList<Student>();
        cseStudents.add(s1);
        cseStudents.add(s2);
        cseStudents.add(s7);

        // List of EE Students
        List<Student> eeStudents = new ArrayList<Student>();
        eeStudents.add(s3);

        // List of ME Students
        List<Student> meStudents = new ArrayList<Student>();
        meStudents.add(s4);

        // List of Civil Students
        List<Student> civilStudents = new ArrayList<Student>();
        civilStudents.add(s5);

        //List of Architecture Students
        List<Student> archStudents = new ArrayList<Student>();
        archStudents.add(s6);

        // List of Departments
        Department CSE = new Department("CSE", cseStudents);
        Department EE = new Department("EE", eeStudents);
        Department ME = new Department("ME", meStudents);
        Department CV = new Department("CV", civilStudents);
        Department AC = new Department("AC", archStudents);

        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
        departments.add(ME);
        departments.add(CV);
        departments.add(AC);

        // Creating Institute Object
        Institute institute = new Institute("IIT", departments);

        System.out.print("Total number of departments in Institute: ");
        System.out.print(institute.getTotalDepartments());

        System.out.println();
        System.out.print("Total students in Institute : ");
        System.out.print(institute.getTotalStudentsInInstitute());

    }
}
