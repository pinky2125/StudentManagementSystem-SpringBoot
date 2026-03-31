package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class HelloController {

    List<Student> list = new ArrayList<>();

    @GetMapping("/")
    public String home() {
        return "Student API running 🚀";
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student s) {
        list.add(s);
        return "Student Added!";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return list;
    }
}