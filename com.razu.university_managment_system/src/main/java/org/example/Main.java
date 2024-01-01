package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {
        List<Student> returnStudentList = new ArrayList<>();
        List<Teacher> returnTeacherList = new ArrayList<>();
        List<Course> returnCourseList = new ArrayList<>();
        List<Department> returnDepartmentList = new ArrayList<>();

        returnStudentList = studentFactory();
        returnTeacherList = teacherFactory();
        returnDepartmentList = departmentFactory();
        returnCourseList = courseFactory();

//        for(Student i: returnStudentList){
//            System.out.println(i);
//        }
//        for(Teacher i : returnTeacherList){
//            System.out.println(i);
//        }
//        returnDepartmentList.forEach(element -> System.out.println(element));
//        for(Course i : returnCourseList){
//            System.out.println(i);
//        }
        buildUniversity(returnDepartmentList,returnStudentList,returnTeacherList,returnCourseList);



//        University university = new University("UIU");
//        System.out.println(university);
//        addStudentInCourse();

    }
    public static void buildUniversity(List<Department> departmentList,List<Student> studentList, List<Teacher> teacherList, List<Course> courseList){
        University uiu = new University("United International University");
        uiu.setDepartmentList(departmentList);
        int numberOfCourse=0;
        System.out.println(uiu);


        //List<Department> department = departmentList;
        System.out.println(departmentList);
        for(Department i : departmentList){
            if(Objects.equals(i.getName(),"EEE")){
                System.out.println(courseList.get(0));
                i.addCourse(courseList.get(0));
                i.addCourse(courseList.get(1));
            }

            else if(Objects.equals(i.getName(),"CSE")) {
                i.addCourse(courseList.get(3));
            }
            else if(Objects.equals(i.getName(),"BBA")){
                i.addCourse(courseList.get(4));
                i.addCourse(courseList.get(5));
            }
            //System.out.println(courseList);
        }

        System.out.println(departmentList);

//            for (Course j : course){
//                for(Course l : courseList){
//                    numberOfCourse ++ ;
//                    if(numberOfCourse<2){
//                        j.setName(l);
//                    }
//                }
//            }

//        for(Course i:courseList){
//            numberOfCourse ++ ;
//            if(numberOfCourse<2){
//            }
//        }

    }
//    public static void  addStudentInCourse() {
//        University uiu = new University();
//        uiu.setName("UIU");
//
//        Department eee = new Department();
//        eee.setName("EEE");
//        if (!uiu.getDepartmentList().contains(eee)) {
//            uiu.addDepartment(eee);
//        }
//
//        Department cse = new Department();
//        cse.setName("CSE");
//        if (!uiu.getDepartmentList().contains(cse)) {
//            uiu.addDepartment(cse);
//        }
//
//        Department bba = new Department();
//        bba.setName("BBA");
//        if (!uiu.getDepartmentList().contains(bba)) {
//            uiu.addDepartment(bba);
//        }
//
//        System.out.println(uiu);
//
//        Teacher salimullah = new Teacher("Salimullah");
//        Teacher manik = new Teacher("Manik Munshi");
//        Teacher salauddin = new Teacher("Salauddin Ahamed") ;
//        Course programing = new
//        if (!cse.getTeacherList().contains(salimullah) && bba.getTeacherList().contains(salimullah) && !eee.getStudentList().contains(salimullah)) {
//            eee.addTeacher(salimullah);
//        }
//        System.out.println(salimullah);
//    }
    public static List<Student> studentFactory(){

        List<Student> studentList = new ArrayList<>();
        Student rahim = new Student("Rahim Ahamed");
        studentList.add(rahim);

        Student karim = new Student("karim Khan");
        studentList.add(karim);

        Student newton = new Student("Newton Rahman");
        studentList.add(newton);

        Student galilio = new Student("Galilio Bishawas");
        studentList.add(galilio);

        Student raihan = new Student("Raihan Mollah");
        studentList.add(raihan);

        Student harun = new Student("Harun Mollah");
        studentList.add(harun);

        Student niem = new Student("Niem Choudhury");
        studentList.add(niem);

        Student saimon = new Student("Saimun Rahman");
        studentList.add(saimon);

        Student deve = new Student("Deve Khan");
        studentList.add(deve);

        Student evan = new Student("Evan Rahman");
        studentList.add(evan);
        return studentList;
    }
    public static List<Teacher> teacherFactory(){
        List<Teacher> teacherList = new ArrayList<>();

        Teacher salimullah = new Teacher("Salimullah");
        teacherList.add(salimullah);

        Teacher manik = new Teacher("Manik Munshi");
        teacherList.add(manik);

        Teacher salauddin = new Teacher("Salauddin Ahamed");
        teacherList.add(salauddin);

        Teacher ibc = new Teacher("Iqban bahar choudhury");
        teacherList.add(ibc);

        Teacher dider = new Teacher("Dider Khan");
        teacherList.add(dider);
        return teacherList;
    }
    public static List<Course> courseFactory(){
        List<Course> courseList = new ArrayList<>();

        Course math = new Course("Mathematics");
        courseList.add(math);

        Course electronics = new Course("Electronics 1");
        courseList.add(electronics);

        Course spl = new Course("Structural programming language");
        courseList.add(spl);

        Course english = new Course("English 1");
        courseList.add(english);

        Course accounting = new Course("Accounting");
        courseList.add(accounting);

        return courseList;

    }
    public static List<Department> departmentFactory(){
        List<Department> departmentList = new ArrayList<>();

        Department eee = new Department("Electrical and Electronic Engineering");
        departmentList.add(eee);

        Department cse = new Department("Computer science");
        departmentList.add(cse);

        Department bba = new Department("Business Administration");
        departmentList.add(bba);
        return departmentList;
    }

}