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
    public void print_userInformation(String username, String role, int score)
    {
        System.out.println("UserName:" + username);
        System.out.println("Role: " + role);
        System.out.println("Has score: " + score);
    }
}
