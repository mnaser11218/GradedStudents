package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getStudents() {
    }

    @Test
    public void setStudents() {
    }

    @Test
    public void getAverageExamScore() {

        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);

//	* Sample Output
//
//		```
//        125.0
        double expected = 125.0;
        Assert.assertEquals(output, expected, 0.001);
    }

    @Test
    public void testAddStudent(){
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        Student student2 =  new Student("Leon2", "Hunter2", examScores);
        // When
        Student[] preEnrollment = classroom.getStudents();
        //System.out.println(Arrays.toString(preEnrollment));
        classroom.addStudent(student);
        classroom.addStudent((student2));


        Student[] postEnrollment = classroom.getStudents();
        String expected = "[Student Name: Leon Hunter\n" +
                "Average Score: 125.0 \n" +
                "Exam Scores: \n" +
                "Exam 1 -> 100 \n" +
                "Exam 2 -> 150 \n" +
                "Exam 3 -> 250 \n" +
                "Exam 4 -> 0 \n" +
                "]";
        Assert.assertEquals(Arrays.toString(postEnrollment),expected);
    }

    @Test
    public void testRemoveStudent(){
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        classroom.addStudent(student);
        Student[] preEnrollment = classroom.getStudents();

        //System.out.println(Arrays.toString(preEnrollment));

        classroom.removeStudent("Leon", "Hunter");
        String expected = "[null]";
       String actual = Arrays.toString(classroom.getStudents());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetStudentsByScore(){

        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        classroom.addStudent(student);

        Double[] examScores2 = { 10.0, 16.0, 24.0, 9.0 };
        Student student2 = new Student("Leon2", "Hunter2", examScores2);
        classroom.addStudent(student2);

        Double[] examScores3 = { 98.0, 44.0, 20.0, 1.0 };
       Student student3 = new Student("Leon3", "Hunter3", examScores3);
        classroom.addStudent(student3);

        Double[] examScores4 = { 10.0, 16.0, 24.0, 9.0 };
        Student student4 = new Student("Abe", "Bee", examScores4);
        classroom.addStudent(student4);

        Double[] examScores5 = { 100.0, 150.0, 250.0, 0.0 };
        Student student5 = new Student("AAR", "AAA", examScores5);
        classroom.addStudent(student5);

        //System.out.println("before sorting -> " + Arrays.toString(classroom.getStudents()));

       // System.out.println(Arrays.toString(classroom.getStudents()));
        System.out.println(classroom.getStudentsByScore());

    }


}
