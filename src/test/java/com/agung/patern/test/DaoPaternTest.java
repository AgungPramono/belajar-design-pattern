package com.agung.patern.test;

import com.agung.pattern.dao.SqlConstant;
import com.agung.pattern.dao.Student;
import com.agung.pattern.dao.StudentDaoImpl;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class DaoPaternTest {

    private final StudentDaoImpl studentDao = new StudentDaoImpl();

    @Test
    public void testGetAllStudent() {
        List<Student> result = studentDao.getAllStudents();
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());

        for (Student student : result) {
            System.out.println("Student Name : " + student.getStudentName());
            System.out.println("Student Id : " + student.getStudentID());
        }
    }

    @Test
    public void testGetStudent() {
        Student student1 = studentDao.getStudent(0);
        Student student2 = studentDao.getStudent(1);

        Assert.assertNotNull(student1);
        Assert.assertNotNull(student2);
        Assert.assertEquals("Agung", student1.getStudentName());
        Assert.assertEquals("Adi", student2.getStudentName());
    }

    @Test
    public void testRemoveStudent() {
        studentDao.deleteStudent(1);
        Integer countAllStudent = studentDao.getAllStudents().size();
        Assert.assertEquals(Integer.valueOf(2), countAllStudent);
    }

    @Test
    public void testUpdateStudent() {
        Student s = new Student("Agung Pramono", 0);
        studentDao.updateStudent(s);

        Student s2 = studentDao.getStudent(0);

        Assert.assertEquals("Agung Pramono", s2.getStudentName());
    }

    @Test
    public void testAddStudent() {
        Student student = new Student("Endy", 2);
        studentDao.addStudent(student);

        int size = studentDao.getAllStudents().size();
        Assert.assertEquals(3, size);
    }
}
