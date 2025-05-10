package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Student;
import com.example.repositories.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepo;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        Student student = studentRepo.findById(id).orElseThrow();
        student.setName(updatedStudent.getName());
        student.setCourse(updatedStudent.getCourse());
        return studentRepo.save(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentRepo.findById(id).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepo.deleteById(id);
    }

    // 🔄 Pagination
    @GetMapping
    public Page<Student> getAllStudents(Pageable pageable) {
        return studentRepo.findAll(pageable);
        
        
    }
    @GetMapping("/by-course/{courseId}")
    public Page<Student> getStudentsByCourse(@PathVariable Long courseId, org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable pageable) {
        return studentRepo.findByCourseId(courseId, pageable);
    }

}
