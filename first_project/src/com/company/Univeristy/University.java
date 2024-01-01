package com.company.Univeristy;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    List<Department> departmentList = new ArrayList<>();

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", departmentList=" + departmentList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }
    public void setDepartmenttoDepartmentList(Department department) {
        departmentList.add(department);
    }

    public University(String name, List<Department> departmentList) {
        this.name = name;
        this.departmentList = departmentList;
    }


    public University() {
    }
}
