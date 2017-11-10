package Quizzer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
public class UserView {
    public void printInformation(String username, String role, int score)
    {
        System.out.print("UserName:" + username);
        System.out.print("Role: " + role);
        System.out.print("Has score: " + score);
    }
}
