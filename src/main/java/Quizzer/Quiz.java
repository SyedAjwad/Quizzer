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
public class Quiz {
    private String title;
    private String description;
    private int num_question;
    private Question questions[];
    
    public void set_title(String title)
    {
        this.title = title;
    }
    public void set_description(String description)
    {
        this.description = description;
    }
    public void set_num_question(int num_question)
    {
        this.num_question = num_question;
    }
    public void set_questions(Question questions[])
    {
        this.questions = questions;
    }
    public String get_title()
    {
        return title;
    }
    public String get_description()
    {
        return description;
    }
    public int get_num_question()
    {
        return num_question;
    }
    public Question[] get_questions()
    {
        return questions;
    }
    public boolean add_quiz()
    {
        return true;
    }
}