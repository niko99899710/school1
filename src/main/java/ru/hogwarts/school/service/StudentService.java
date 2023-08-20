package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {
    private final Map<Long, Student> students = new HashMap<>();
    private long newId = 0;

    public Student createStudent(Student student) {
        student.setId(++newId);
        students.put(newId, student);
        return student;
    }

    public Student findStudent(long Id) {
        return students.get(Id);
    }

    public Student updateStudent(long newId, Student student) {
        students.put(newId, student);
        return student;
    }

    public Student deletStudent(long id) {
        return students.remove(id);
    }

    public Collection<Student> findAge(int age) {
        ArrayList<Student> countStudent = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getAge() == age) {
                countStudent.add(student);
            }
        }
        return countStudent;
    }
}
