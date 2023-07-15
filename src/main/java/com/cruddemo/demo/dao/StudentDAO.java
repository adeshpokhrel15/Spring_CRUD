package com.cruddemo.demo.dao;

import com.cruddemo.demo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();



}
