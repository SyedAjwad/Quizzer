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
public class Question {
    private String text;
    private String type;
    private int options;
    private int exp_correct_opt;
    private int max_score;
    
    public void set_text(String text)
    {
        this.text = text;
    }
    public void set_type(String type)
    {
        this.type = type;
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
    public String get_text()
    {
        return text;
    }
    public String get_type()
    {
        return type;
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
