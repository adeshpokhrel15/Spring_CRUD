package com.cruddemo.demo.dao;

import com.cruddemo.demo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);



}
