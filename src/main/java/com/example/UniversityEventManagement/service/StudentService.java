package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Department;
import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String createStudent(Student student) {
        studentRepo.save(student);
        return "Students added Sucessfully";
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepo.findAll();
    }

    // for updating department by student id
    public String updateStudentById(Long id, Department department) {
        Optional<Student> optionalStudent=studentRepo.findById(id);
        if(optionalStudent.isPresent()){
            Student student=optionalStudent.get();
            student.setStudentDepartment(department);
            studentRepo.save(student);
            return "Department updated";
        }
        else return "Student not found id:";

    }
// for deleting student based on id
    public String deleteStudentById(Long id) {
        Optional<Student> optionalStudent=studentRepo.findById(id);
        if(optionalStudent.isPresent()){
            studentRepo.deleteById(id);
            return "student id:"+id+" deleted Sucessfully";
        }
        else return "Student not found id:";
    }
// getting student by id
    public Student getStudentById(Long id) {
        Optional<Student> optionalStudent=studentRepo.findById(id);
           return  optionalStudent.get();
    }
}
