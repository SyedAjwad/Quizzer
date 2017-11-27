/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.View;

/**
 *
 * @author AJ
 */
public class QuestionView {
    public void print_questionInformation(int question_id, int position, String text, int options, int exp_cor_opt, int max_score)
    {
        System.out.println("Question ID:" + question_id);
        System.out.println("Position:" + position);
        System.out.println("Text: " + text);
        System.out.println("Has options: " + options);
        System.out.println("Correct option: " + exp_cor_opt);
        System.out.println("Has Max Score: " + max_score);
    }
}
