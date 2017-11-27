/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.BoImpl;

import Quizzer.Bo.QuizBo;
import Quizzer.Dao.QuizDao;
import Quizzer.Model.Quiz;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AJ
 */
public class QuizBoImpl implements QuizBo {

    public List<Quiz> QuizRoster;

    public QuizBoImpl() {
        QuizRoster = new ArrayList<>();
    }

    @Override
    public Quiz addQuiz(String title, String description, int num_question) {
        Quiz tempQuiz = new Quiz();
        tempQuiz.set_title(title);
        tempQuiz.set_description(description);
        tempQuiz.set_num_question(num_question);
        QuizRoster.add(tempQuiz);
        return tempQuiz;
    }
    
    @Override
    public void saveQuiz() {
        QuizDao QuizD = new QuizDao();
        QuizD.saveQuiz(QuizRoster);
    }

}
