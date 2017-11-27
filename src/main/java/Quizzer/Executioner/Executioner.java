/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.Executioner;

import Quizzer.Bo.QuestionBo;
import Quizzer.BoImpl.QuizBoImpl;
import Quizzer.Bo.QuizBo;
import Quizzer.Bo.UsersBo;
import Quizzer.BoImpl.QuestionBoImpl;
import Quizzer.BoImpl.UsersBoImpl;
import Quizzer.Model.Quiz;

/**
 *
 * @author AJ
 */
public class Executioner {

    private UsersBo UsersHandler = new UsersBoImpl();
    private QuizBo QuizHandler = new QuizBoImpl();
    private QuestionBo QuestionHandler = new QuestionBoImpl();
    
    public static void main(String[] args) {
        Executioner exe = new Executioner();
        exe.doAll();
    }
    
    /**
     * Perform all action here
     */
    public void doAll(){
        int user1Id = UsersHandler.addUser("Ajwad", "hidden");
        UsersHandler.addStudent(user1Id, 0);
        Quiz quiz = QuizHandler.addQuiz("Advavnced Programming", "Quiz to test your Scala skills", 2);
        for (int i = 0; i < 2; i++)
        {
            QuestionHandler.addQuestion(quiz, 0, "Is Scala functional", 2, 1, 5);
        }
        QuizHandler.saveQuiz();
        UsersHandler.saveUsers();
        QuestionHandler.saveQuestion();
        /*int emp2Id = employeeHandler.addEmployee("Obaid");
        int emp3Id = employeeHandler.addEmployee("Zohaib");
        int emp4Id = employeeHandler.addEmployee("Sadaf");
        
        employeeHandler.addRegularEmployee(emp1Id, 1.0f , 0);
        employeeHandler.addContractEmployee(emp2Id, 0.3f , "1 year");
        employeeHandler.addContractEmployee(emp3Id, 0.2f , "1 year");
        employeeHandler.addContractEmployee(emp4Id, 0.6f , "2 years");
        taskHandler.addTask("Task 1");
        System.out.println(taskHandler.startTask());
        employeeHandler.saveEmployees();
        taskHandler.saveTasks();
        System.out.println(taskHandler.endTask());
        resourceHandler.saveResources();*/
    }
}
