package com.dxc.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
