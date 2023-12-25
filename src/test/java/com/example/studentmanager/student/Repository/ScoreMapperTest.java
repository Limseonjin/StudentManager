package com.example.studentmanager.student.Repository;

import com.example.studentmanager.student.entity.Score;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ScoreMapperTest {
    @Autowired
    public ScoreMapper scoreMapper;
    @Test
    @DisplayName("")
    void findAll() {
        //given

        //when
        List<Score> scores = scoreMapper.scoreList();
        //then
    }
}