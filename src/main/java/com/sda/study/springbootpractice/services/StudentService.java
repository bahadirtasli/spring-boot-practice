package com.sda.study.springbootpractice.services;

import com.sda.study.springbootpractice.exceptions.StudentNotFoundException;
import com.sda.study.springbootpractice.models.Student;

import java.util.List;

/**
 * To handle all Student related operations
 *
 * @author Bahadir Tasli
 * @Date 3/16/2023
 */


public interface StudentService {

    /**
     * To create a new student
     *
     * @param student Student
     */
    void createStudent(Student student);


    /**
     * To find a student by ID
     * @param id Student ID
     * @return Student
     */
    Student findStudentById(Long id) throws StudentNotFoundException;

    /**
     * To find a student by name
     * @param name Student name
     * @return Student
     */
    Student findStudentByName(String name) throws StudentNotFoundException;

    /**
     * To find all students
     *
     * @return a list of Student
     */
    List<Student> findAllStudents();

    /**
     * To update an existing Student
     *
     * @param student
     */
    void updateStudent(Student student) throws StudentNotFoundException;

    /**
     * To delete a Student by ID
     * @param id Student id
     */
    void deleteStudentById(Long id) throws StudentNotFoundException;

    /**
     * To restore a Student by ID
     *
     * @param id Student id
     */
    void restoreStudentById(Long id) throws StudentNotFoundException;

}

