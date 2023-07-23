package Aggregation;

import java.util.List;

public class Institute {

    String instituteName;
    private List<Department> departments;
    List<Student> students;

    public Institute(String instituteName, List<Department> departments){
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public int getTotalStudentsInInstitute(){

        int noOfStudents = 0;
        for(Department depts : departments){
            students = depts.getStudents();
            for(Student st : students){
                noOfStudents++;
            }
        }
        return noOfStudents;
    }

    public int getTotalDepartments(){
        int noOfDepartments = 0;

        for(Department depts : departments){
            noOfDepartments ++;
        }
        return noOfDepartments;
    }
}
