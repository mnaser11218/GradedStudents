package io.zipcoder;

import java.util.*;

public class Classroom  {
    private int maxNumberOfStudents;

    private Student[] students = new Student[maxNumberOfStudents];

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents){
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Double getAverageExamScore(){
        Double count= 0.0;
        for(Student student : students){
            count+=  student.getAverageExamScore();
        }
        return count / students.length;
    }


    public void addStudent(Student student){
       Student[] newStudents = new Student[students.length+1];
       int i =0;
       for(Student s : students){
           newStudents[i] = s;
           i++;
       }
       newStudents[i] = student;
       this.students = newStudents;
    }

    public void removeStudent(String firstName, String lastName){
        Student[] newStudents = new Student[students.length];
        int i = 0;
        for(Student s : students){
            if(!s.getFirstName().equals(firstName) && !s.getLastName().equals(lastName)){
                newStudents[i] = students[i];
            }
          //  newStudents[students.length-1] = null;
            students = newStudents;
        }

    }


    public String getStudentsByScore(){
Arrays.sort(students);
return Arrays.toString(students);

//        ArrayList<Student> infos = new ArrayList<Student>();
//        List al = Arrays.asList(this.students);
//        al.sort(Comparator.comparing(Student::getAverageExamScore).reversed());
//        return al;



    }
//
//    @Override
//    public int compareTo(Student student) {
//        System.out.println("hello");
//        return 322;
//    }
}
