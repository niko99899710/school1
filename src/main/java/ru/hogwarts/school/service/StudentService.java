package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {
    private final Map<Long, Student> students = new HashMap<>();
    private long newId = 0;

    public Student createStudent(Student student) {
        student.setId(++newId);
        students.put(newId, student);
        return student;
    }

    public Student findStudent(Student student) {

    }


}
