package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;

import java.util.*;

@Service
public class FacultyService {
    private final Map<Long, Faculty> faculties = new HashMap<>();
    private long newIdFaculty = 0;

    public Faculty createFaculty(Faculty faculty) {
        faculty.setId(++newIdFaculty);
        faculties.put(newIdFaculty, faculty);
        return faculty;
    }

    public Faculty findFaculty(long Id) {
        return faculties.get(Id);
    }

    public Faculty updateFaculty(long Id, Faculty faculty) {
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    public Faculty deleteSFaculty(long id) {
        return faculties.remove(id);
    }


    public Collection<Faculty> findColor(String color) {
        ArrayList<Faculty> count = new ArrayList<>();
        for (Faculty faculty : faculties.values()) {
            if (Objects.equals(faculty.getColor(), color)) {
                count.add(faculty);
            }
        }
        return count;
    }
}
