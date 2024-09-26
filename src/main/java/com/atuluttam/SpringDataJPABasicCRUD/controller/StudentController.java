package com.atuluttam.SpringDataJPABasicCRUD.controller;


import com.atuluttam.SpringDataJPABasicCRUD.Model.Student;
import com.atuluttam.SpringDataJPABasicCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStudent()
    {
         return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id)
    {
            return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student)
    {
        return studentService.updateStudent(id, student);
    }


    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable  Long id)
    {
        studentService.deleteStudent(id);
    }




    // Get student by ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
//        Student student = studentService.getStudentById(id);
//        return student != null ? ResponseEntity.ok(student) : ResponseEntity.notFound().build();
//    }



}
