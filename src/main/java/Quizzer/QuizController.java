/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer;

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
    public void set_questions(Question questions[])
    {
        model.set_questions(questions);
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
    public Question[] get_questions()
    {
        return model.get_questions();
    }
    public void updateView(){				
      view.print_quizInformation(model.get_title(), model.get_description(), model.get_num_question());
   }
}