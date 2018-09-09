//
// StudentDaoImpl.java
// Java-Design-Patern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//
package com.agung.pattern.dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class StudentDaoImpl implements StudentDao {

    private final List<Student> listStudents;

    public StudentDaoImpl() {
        listStudents = new ArrayList<>();
        Student std1 = new Student("Agung", 0);
        Student std2 = new Student("Adi", 1);

        listStudents.add(std1);
        listStudents.add(std2);
    }

    @Override
    public List<Student> getAllStudents() {
        return listStudents;
    }

    @Override
    public void updateStudent(Student s) {
        listStudents.get(s.getStudentID()).setStudentName(s.getStudentName());
        System.out.println("Student with ID : " + s.getStudentID() + " update");
    }

    @Override
    public void deleteStudent(Integer id) {
        listStudents.remove(id);
        System.out.println("Student with id " + id + " delete from database");
    }

    @Override
    public void addStudent(Student s) {
        listStudents.add(s);
    }

    @Override
    public Student getStudent(Integer idStudent) {
        return listStudents.get(idStudent);
    }

}
