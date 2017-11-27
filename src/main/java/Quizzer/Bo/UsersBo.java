package Quizzer.Bo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
public interface UsersBo {
    int addInstructor(int userIndex);

    int addUser(String name, String password);

    int addStudent(int userIndex, int score);

    void saveUsers();
}
