package com.example.demo.service;
import com.example.demo.InvalidDataException;

import java.util.*;
import com.example.demo.model.Student;

public class StudentService {

    List<Student> list = new ArrayList<>();

    public String addStudent(Student s) {

        if(s.getMarks() < 0 || s.getMarks() > 100) {
            throw new InvalidDataException("Marks should be between 0 and 100!");
        }

        for(Student st : list) {
            if(st.getId() == s.getId()) {
                throw new InvalidDataException("ID already exists!");
            }
        }

        list.add(s);
        return "Student Added!";
    }

    public List<Student> getStudents() {
        return list;
    }

    public String updateStudent(int id, Student newData) {
        for(Student s : list) {
            if(s.getId() == id) {
                s.setName(newData.getName());
                s.setMarks(newData.getMarks());
                return "Student Updated!";
            }
        }
        return "Student Not Found!";
    }

    public String deleteStudent(int id) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                list.remove(i);
                return "Student Deleted!";
            }
        }
        return "Student Not Found!";
    }
}