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
public class QuizView {
    public void print_quizInformation(int quiz_id, String title, String description, int num_question)
    {
        System.out.println("Quiz ID:" + quiz_id);
        System.out.println("Title:" + title);
        System.out.println("Description: " + description);
        System.out.println("Has questions: " + num_question);
    }
}