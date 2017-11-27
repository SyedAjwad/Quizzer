/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.BoImpl;

import Quizzer.Bo.QuestionBo;
import Quizzer.Dao.QuestionDao;
import Quizzer.Model.Question;
import Quizzer.Model.Quiz;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AJ
 */
public class QuestionBoImpl implements QuestionBo {
    public List<Question> QuestionRoster;

    public QuestionBoImpl() {
        QuestionRoster = new ArrayList<>();
    }

    @Override
    public int addQuestion(Quiz quiz, int position, String text, int options, int exp_correct_opt, int max_score)
    {
        Question tempQuestion = new Question();
        tempQuestion.setQuiz(quiz);
        tempQuestion.set_position(position);
        tempQuestion.set_text(text);
        tempQuestion.set_options(options);
        tempQuestion.set_expected_option(exp_correct_opt);
        tempQuestion.set_max_score(max_score);
        QuestionRoster.add(tempQuestion);
        return QuestionRoster.indexOf(tempQuestion);   
    }
    
    @Override
    public void saveQuestion() {
        QuestionDao QuestionD = new QuestionDao();
        QuestionD.saveQuestion(QuestionRoster);
    }
}
