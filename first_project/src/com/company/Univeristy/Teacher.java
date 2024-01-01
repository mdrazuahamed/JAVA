package com.company.Univeristy;

public class Teacher {
    private String name;
    private Course courseName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourseName() {
        return courseName;
    }

    public void setCourseName(Course courseName) {
        this.courseName = courseName;
    }

    public Teacher(String name, Course courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    public Teacher() {
    }
}
