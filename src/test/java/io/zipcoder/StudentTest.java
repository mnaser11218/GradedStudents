package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class StudentTest {

    @Test
    public void compareTo() {

    }

    @Test
    public void getFirstName() {
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void setLastName() {
    }

    @Test
    public void getNumberOfExamsTaken() {
        Student student = new Student();
        int expected = 0;
        int actual = student.getNumberOfExamsTaken();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestgetExamScores(){
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student("name", "last name", examScores);
        String expected = "Exam Scores: ";
        String actual = student.getExamScores();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }
@Test
    public void testAddExamScore(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);
        student.addExamScore(100.0);
        String output = student.getExamScores();
        System.out.println(output);
        Assert.assertEquals(output, "Exam score: 100.0" );
    }

    @Test
    public void testSetExamScore(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 200.3, 300.8 };
        Student student = new Student(firstName, lastName, examScores);

// When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

// Then

        System.out.println(output);
        Assert.assertEquals(output, 150.0);
    }

    @Test
    public void testGetAverageExamScore(){
       //: Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double output = student.getAverageExamScore();

        // Then
        Double expected = 125.0;
       Assert.assertEquals(expected, output);
    }

    @Test
    public void testToString(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);
        String expected = "Student Name: Leon Hunter\n" +
                "Average Score: 100.0 \n" +
                "Exam Scores: \n" +
                "Exam 1 -> 150 \n" +
                "Exam 2 -> 250 \n" +
                "Exam 3 -> 0  ";
      //  Assert.assertEquals(output, expected);
    }



}