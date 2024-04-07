package org.example.week7;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {
    //data- fields- instance variable
    private String name;
    private int code;
    private List<String> students;
    private int maxStudent;

    // these are called getter and setter which is used to access private
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        if ( maxStudent <0){
            return;
        }
        this.maxStudent = maxStudent;
    }

    public ITECCourse(String courseName, int courseCode, int courseMaxStudents){
        this.name=courseName;
        //you can also do this other way
        //name=courseName;
        this.code=courseCode;
        this.maxStudent=courseMaxStudents;
        this.students = new ArrayList<>();
    }

   public void addStudent (String studentName){// this method is called in the object to add the name of students
        if (students.size()==maxStudent){// checking if the number of students is equal to max number of students
            System.out.println(" Course is full cant add "+ studentName);
        }else {
            students.add(studentName);
        }
    }
    public void writeCourseInfo() {// this method holds the course details in the object
        System.out.println("Course Name "+ name);
        System.out.println("Course Code "+ code);
        System.out.println("Students enrolled : ");
        for (String student: students){
            System.out.println(student);
        }
        System.out.println("There are "+ getNumberOfStudents () + " students enrolled ");
        System.out.println("The max number of students that can enroll in this course is "+ maxStudent);

    }
   public int getNumberOfStudents() {// this gets the number of students that enrolled
        return students.size();
    }

    void removeStudents( String studentName){// this method is used in the object to remove a student
        if ( students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName +" was un-enrolled from "+ name);
        }else {
            System.out.println(studentName + " was not found in " + name);
        }
    }



}
