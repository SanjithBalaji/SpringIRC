package com.sample.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sample.demo.Model.Answer;

public interface AnswerRepo extends JpaRepository<Answer,Integer>{

}