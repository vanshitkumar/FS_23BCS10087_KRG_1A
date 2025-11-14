package com.vanshit.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.vanshit.quizapp.model.Question;
import com.vanshit.quizapp.model.Quiz;

import java.util.List;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
    
    // Find quizzes that contain a specific question
    List<Quiz> findByQuestionsContaining(Question question);
    
    // Native query to remove question from join table
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM quiz_questions WHERE questions_id = :questionId", nativeQuery = true)
    void removeQuestionFromAllQuizzes(@Param("questionId") Integer questionId);
    
    // Alternative method using question ID
    @Query("SELECT q FROM Quiz q JOIN q.questions ques WHERE ques.id = :questionId")
    List<Quiz> findQuizzesByQuestionId(@Param("questionId") Integer questionId);
}