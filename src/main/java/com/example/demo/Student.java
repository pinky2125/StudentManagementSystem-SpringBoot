package com.example.demo;

public class Student {

    private int id;
    private String name;
    private int marks;

    // Constructor
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // GETTERS
    public int getId() { return id; }
    public String getName() { return name; }
    public int getMarks() { return marks; }

    // 🔥 SETTERS (ye missing the)
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}