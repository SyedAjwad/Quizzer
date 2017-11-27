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
public interface QuestionBo {
    
    int addQuestion(Quiz quiz, int position, String text, int options, int exp_correct_opt, int max_score);
    
    void saveQuestion();
    
}
