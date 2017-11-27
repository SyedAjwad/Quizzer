
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.Controller;

import Quizzer.Model.Question;
import Quizzer.View.QuestionView;

/**
 *
 * @author AJ
 */
public class QuestionController {
    private Question model;
    private QuestionView  view;
    
    public QuestionController(Question model, QuestionView view)
    {
        this.model = model;
        this.view = view;
    }
    public void set_question_id(int question_id)
    {
        model.set_question_id(question_id);
    }
    public void set_position(int position)
    {
        model.set_position(position);
    }
    public void set_text(String text)
    {
        model.set_text(text);
    }
    public void set_options(int options)
    {
        model.set_options(options);
    }
    public void set_expected_option(int exp_correct_opt)
    {
        model.set_expected_option(exp_correct_opt);
    }
    public void set_max_score(int max_score)
    {
        model.set_max_score(max_score);
    }
    public int get_question_id()
    {
        return model.get_question_id();
    }
    public int get_position()
    {
        return model.get_position();
    }
    public String get_text()
    {
        return model.get_text();
    }
    public int get_options()
    {
        return model.get_options();
    }
    public int get_expected_option()
    {
        return model.get_expected_option();
    }
    public int get_max_score()
    {
        return model.get_max_score();
    }
    public void updateView(){				
      view.print_questionInformation(model.get_question_id(),model.get_position(), model.get_text(), model.get_options(), model.get_expected_option(), model.get_max_score());
   }
}