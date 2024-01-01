package com.company.Univeristy;

import java.util.ArrayList;
import java.util.List;

public class CourseEnrollment {
    List<University> universityList= new ArrayList<>();
    List<Department> departmentList = new ArrayList<>();
    List<Teacher>    teacherList    = new ArrayList<>();
    List<Teacher>    eeeDepartmentTeacherList    = new ArrayList<>();
    List<Teacher>    cseDepartmentTeacherList    = new ArrayList<>();
    List<Teacher>    bbaDepartmentTeacherList    = new ArrayList<>();
    List<Course>     courseList     = new ArrayList<>();
    List<Student>    studentList    = new ArrayList<>();

    @Override
    public String toString() {
        return "CourseEnrollment{" +
                "universityList=" + universityList +
                ", departmentList=" + departmentList +
                ", teacherList=" + teacherList +
                ", eeeDepartmentTeacherList=" + eeeDepartmentTeacherList +
                ", cseDepartmentTeacherList=" + cseDepartmentTeacherList +
                ", bbaDepartmentTeacherList=" + bbaDepartmentTeacherList +
                ", courseList=" + courseList +
                ", studentList=" + studentList +
                '}';
    }

    public static void main(String[] args) {
        com.company.Univeristy.CourseEnrollment courseEnrollment = new CourseEnrollment();
        courseEnrollment.addStudentInCourse();
        System.out.println(courseEnrollment.toString());
    }

    public void  addStudentInCourse(){
        University uiu = new University();
        uiu.setName("UIU");
        universityList.add(uiu);

        Department eee = new Department();
        eee.setName("EEE");
        if(!departmentList.contains(eee)){ departmentList.add(eee); }

        Department cse = new Department();
        cse.setName("CSE");
        if(!departmentList.contains(cse)){ departmentList.add(cse); }

        Department bba = new Department();
        bba.setName("BBA");
        if(!departmentList.contains(bba)){ departmentList.add(bba); }

        Teacher salimullahEEE = new Teacher();
        if(!cse.teacherList.contains(salimullahEEE) && bba.teacherList.contains(salimullahEEE))
            eee.setTeacherToTeacherList(salimullahEEE);
    }
}
