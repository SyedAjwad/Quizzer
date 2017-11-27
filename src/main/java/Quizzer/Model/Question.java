/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.Model;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author AJ
 */
@Entity
@Table(name = "Question")
public class Question implements Serializable{

    @ManyToOne(cascade = CascadeType.ALL)
    private Quiz quiz;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int question_id;
    private int position;
    private String text;
    private int options;
    private int exp_correct_opt;
    private int max_score;
    
    public void setQuiz(Quiz quiz)
    {
        this.quiz = quiz;
    }
    public Quiz getQuiz()
    {
        return quiz;
    }
    public void set_question_id(int question_id)
    {
        this.question_id = question_id;
    }
    public void set_position(int position)
    {
        this.position = position;
    }
    public void set_text(String text)
    {
        this.text = text;
    }
    public void set_options(int options)
    {
        this.options = options;
    }
    public void set_expected_option(int exp_correct_opt)
    {
        this.exp_correct_opt = exp_correct_opt;
    }
    public void set_max_score(int max_score)
    {
        this.max_score = max_score;
    }
    public int get_question_id()
    {
        return question_id;
    }
    public int get_position()
    {
        return position;
    }
    public String get_text()
    {
        return text;
    }
    public int get_options()
    {
        return options;
    }
    public int get_expected_option()
    {
        return exp_correct_opt;
    }
    public int get_max_score()
    {
        return max_score;
    }
}