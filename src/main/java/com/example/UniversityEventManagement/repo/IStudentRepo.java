package com.example.UniversityEventManagement.repo;

import com.example.UniversityEventManagement.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Student,Long> {
}
