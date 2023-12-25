package com.example.studentmanager.student.serivce;

import com.example.studentmanager.student.Repository.ScoreMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ScoreSerivce {

    public ScoreMapper mapper;
}
