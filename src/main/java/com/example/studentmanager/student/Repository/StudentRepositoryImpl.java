package com.example.studentmanager.student.Repository;

import com.example.studentmanager.student.entity.Gender;
import com.example.studentmanager.student.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class StudentRepositoryImpl implements StudentRepository {
    private static int seq = 0;
    public static final Map<Integer, Student> studenRepo;
    static {
        studenRepo = new HashMap<>();
        Student stu1 = new Student(++seq, "랑이", 2, Gender.Male, "01015334432", "충남 공주");
        Student stu2 = new Student(++seq, "둉딘", 2, Gender.Male, "01015326132", "충남 아산");
        Student stu3 = new Student(++seq, "성딘", 2, Gender.Female, "0103252463", "충남 공주");
        studenRepo.put(stu1.getNum(), stu1);
        studenRepo.put(stu2.getNum(), stu2);
        studenRepo.put(stu3.getNum(), stu3);
    }
    @Override
    public List<Student> findAll() {
        return studenRepo.values()
                .stream()
                .collect(Collectors.toList());
    }

    @Override
    public boolean insert(Student stu) {
        return false;
    }

    @Override
    public boolean update(Student stu) {
        return false;
    }

    @Override
    public boolean delete(int stuNum) {
        return false;
    }
}
