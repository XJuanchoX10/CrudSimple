package com.crudsimple.CrudSimple.service;

import com.crudsimple.CrudSimple.entity.Student;
import com.crudsimple.CrudSimple.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }

    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }

    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
