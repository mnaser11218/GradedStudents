package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private ArrayList<Double> examscores = new ArrayList<>();


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
//        testScores.forEach((ts)-> examscores.add(ts));
        examscores.addAll(Arrays.asList(testScores));
    }

    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        if(!o.getAverageExamScore().equals(this.getAverageExamScore())){
            return (int) ( o.getAverageExamScore() -this.getAverageExamScore()  );
        } return this.getFirstName().compareTo(o.getFirstName());

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getNumberOfExamsTaken(){
        return examscores.size();
    }

    public String getExamScores(){
        String results = "Exam Scores: \n";
        String toadd;
        int count = 0;
        if(examscores != null){
            for(Double exam : examscores){
                count++;
                toadd = "Exam " + count + " -> " + exam.intValue() + " \n";
                results +=toadd;

            }
        }

        return results;
    }

    public void addExamScore(double examScore){
        this.examscores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
              examscores.set(examNumber-1, newScore);
    }

    public Double getAverageExamScore(){
        Double count= 0.0;
        for(Double examscore : examscores){
          count+=  examscore;
        }
        return count / examscores.size();
    }

    public String toString(){
//        Student Name: Leon Hunter
//		> Average Score: 125
//                > Exam Scores:
//        Exam 1 -> 100
//        Exam 2 -> 150
//        Exam 3 -> 250
//        Exam 4 -> 0
        String output ="Student Name: " + getFirstName() + " "+  getLastName() + "\n" +
                "Average Score: " + getAverageExamScore() + " \n" +
                getExamScores();
        return output;


    }

}
