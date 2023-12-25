package com.example.studentmanager.student.Repository;

import com.example.studentmanager.student.entity.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScoreMapper {

    // 성적 전체 조회
    List<Score> scoreList();

    // 상세 조회에 개별 성적 조회
    Score findScore(long num);
}
