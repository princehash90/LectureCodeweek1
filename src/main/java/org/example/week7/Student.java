package org.example.week7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Student {
    String name;// the field to store name of the student
    Date registration;// variable field storing the date

    public Student(String name) {// this is constructor
        this.name = name;
        this.registration = new Date();
    }
}
    class ClassList {
        public static void main(String[] args) {

            List<Student> students = new ArrayList<>();// new Arraylist initialized to store students name
            Student s1 = new Student("A");// adding student name
            students.add(s1);// adding the student to list
            Student s2 = new Student("B");// adding student name
            students.add(s2);// adding the student name to the list

            for (Student s : students) {// looping over the list of student
                System.out.println(" Student " + s.name + "registerd at " + s.registration);// printing
            }

        }


    }



