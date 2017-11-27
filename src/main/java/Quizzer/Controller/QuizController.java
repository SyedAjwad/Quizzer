/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.Controller;

import Quizzer.View.QuizView;
import Quizzer.Model.Question;
import Quizzer.Model.Quiz;
import java.util.List;

/**
 *
 * @author AJ
 */
public class QuizController {
    private Quiz model;
    private QuizView  view;
    
    public QuizController(Quiz model, QuizView view){
        this.model = model;
        this.view = view;
        model.set_quiz_id(2);
   }
    public void set_quiz_id(int quiz_id)
    {
        this.model.set_quiz_id(quiz_id);
    }
    public void set_title(String title)
    {
        model.set_title(title);
    }
    public void set_description(String description)
    {
        model.set_description(description);
    }
    public void set_num_question(int num_question)
    {
        model.set_num_question(num_question);
    }
    public void set_questions(List<Question> Ques)
    {
        model.set_questions(Ques);
    }
    public int get_quiz_id()
    {
        return this.model.get_quiz_id();
    }
    public String get_title()
    {
        return model.get_title();
    }
    public String get_description()
    {
        return model.get_description();
    }
    public int get_num_question()
    {
        return model.get_num_question();
    }
    public List<Question> get_questions()
    {
        return model.get_questions();
    }
    public boolean add_quiz(String title, String description, int num_question)
    {
        return model.add_quiz(title, description, num_question);
    }
    public void updateView(){				
      view.print_quizInformation(model.get_quiz_id(),model.get_title(), model.get_description(), model.get_num_question());
   }
}