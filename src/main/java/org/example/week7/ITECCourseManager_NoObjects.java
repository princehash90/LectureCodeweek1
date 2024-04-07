package org.example.week7;

import org.example.week7.ITECCourse;

import java.util.ArrayList;


/**
 * Not an object oriented program.
 */
public class ITECCourseManager_NoObjects {

    public static void main(String[] args) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        //Add some students.   TODO check that we have not exceeded the max number for the class
       maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudents("Carl");// carl will be removed from the list
        maintenanceCourse.removeStudents("Beyonce");// trying to remove a name that is not there
        maintenanceCourse.writeCourseInfo();
        //calling on the constructor on the object
        ITECCourse dataCourse = new ITECCourse("Data Communications",1425,30);

        //Add some students
        dataCourse.addStudent("Dave");
        dataCourse.addStudent("Ed");
        dataCourse.addStudent("Flora");

        dataCourse.writeCourseInfo();

        ITECCourse softwareDevelopment = new ITECCourse(" Software Development Projects", 2903,24);
        softwareDevelopment.addStudent("Hashim");// adding student name
        softwareDevelopment.addStudent("Imran");
        softwareDevelopment.addStudent("Arman");
        softwareDevelopment.addStudent("Aaliyah");

        int totalEnrolled =softwareDevelopment.getNumberOfStudents();
        System.out.println("The" +softwareDevelopment.getName()+ "development has "+totalEnrolled);
        System.out.println("ITEC "+ softwareDevelopment.getCode() + softwareDevelopment.getName());


        softwareDevelopment.setMaxStudent(30);// . can be used to call methods and access variable
        softwareDevelopment.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Made up course", 1234, 3);
        smallCourse.addStudent("Kirby");
       smallCourse.addStudent("Charlotte");
       smallCourse.addStudent("Mike");
       smallCourse.removeStudents("Kirby");
       smallCourse.addStudent("shona");

       smallCourse.writeCourseInfo();


    }


}

