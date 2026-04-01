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

    // 🔥 UPDATE API
    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student newData) {

        for(Student s : list) {
            if(s.getId() == id) {
                s.setName(newData.getName());
                s.setMarks(newData.getMarks());
                return "Student Updated!";
            }
        }

        return "Student Not Found!";
    }

    // 🔥 DELETE API
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                list.remove(i);
                return "Student Deleted!";
            }
        }

        return "Student Not Found!";
    }
}