package com.company.Univeristy;

public class Course {
    String name;
    private Student studentName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudentName() {
        return studentName;
    }

    public void setStudentName(Student studentName) {
        this.studentName = studentName;
    }

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, Student studentName) {
        this.name = name;
        this.studentName = studentName;
    }
}
