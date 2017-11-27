/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author AJ
 */
@Entity
@Table(name = "Quiz")
public class Quiz implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int quiz_id;
    private String title;
    private String description;
    private int num_question;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quiz")
    List<Question> Ques;
    public void set_quiz_id(int quiz_id)
    {
        this.quiz_id = quiz_id;
    }
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
    public void set_questions(List<Question> Ques)
    {
        this.Ques = Ques;
    }
    public int get_quiz_id()
    {
        return quiz_id;
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
    public List<Question> get_questions()
    {
        return Ques;
    }
    public boolean add_quiz(String title, String description, int num_question)
    {
        return true;
    }
}