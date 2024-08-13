package com.crudsimple.CrudSimple.repository;

import com.crudsimple.CrudSimple.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
