package com.example.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    private Long studentId;
    @NotBlank(message = "First name is required")
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First name must start with a capital letter")
    private String studentFirstName;

    private String studentLastName;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 25, message = "Age cannot be more than 25")
    private Integer studentAge;



    private Department studentDepartment;
    public void setStudentDepartment(Department studentDepartment) {
        this.studentDepartment = studentDepartment;
    }
}
