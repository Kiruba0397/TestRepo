package com.stg.firstprj.repository;

import com.stg.firstprj.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
