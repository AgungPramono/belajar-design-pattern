//
// StudentDao.java
// Java-Design-Patern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//

package com.agung.pattern.dao;

import java.util.List;

/**
 *
 */
public interface StudentDao {
    List<Student> getAllStudents();
    void updateStudent(Student s);
    Student getStudent(Integer idStudent);
    void deleteStudent(Integer id);
    void addStudent(Student s);
}
