package com.sample.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.Model.Question;

public interface QuestionRepo extends JpaRepository<Question,Integer>{

}