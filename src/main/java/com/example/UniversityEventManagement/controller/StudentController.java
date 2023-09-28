package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Department;
import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("Student")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("students")
    public String createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("update/student/Department/id/{id}")
    public String updateStudentById(@PathVariable Long id,@RequestBody Department department){
        return studentService.updateStudentById(id,department);
    }

    @DeleteMapping("deleting/id/{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentById(id);
    }

    @GetMapping("get/student/id/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
}
