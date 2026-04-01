package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    StudentService service = new StudentService();

    @GetMapping("/")
    public String home() {
        return "Student API running 🚀";
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student s) {
        return service.addStudent(s);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student s) {
        return service.updateStudent(id, s);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }
}