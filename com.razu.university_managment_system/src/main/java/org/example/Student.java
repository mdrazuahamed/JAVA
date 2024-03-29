package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Student implements Serializable {
    private String name;
    private University university;
    private Department department;
    private List<Course> courseList = new ArrayList<>();
    public void addCourse(Course course){
        courseList.add(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
