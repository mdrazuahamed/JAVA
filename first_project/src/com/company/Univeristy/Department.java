package com.company.Univeristy;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    List<Teacher> teacherList    = new ArrayList<>();

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", teacherList=" + teacherList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    public void setTeacherToTeacherList (Teacher teacherName){
        teacherList.add(teacherName);
    }
}

