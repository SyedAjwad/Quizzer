/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.Bo;

import Quizzer.Model.Quiz;

/**
 *
 * @author AJ
 */
public interface QuizBo {
    
    Quiz addQuiz(String title, String description, int num_question);
    
    void saveQuiz();
}
