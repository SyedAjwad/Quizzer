/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer;

import Quizzer.Controller.UserController;
import Quizzer.View.UserView;
import Quizzer.Model.Users;

/**
 *
 * @author AJ
 */
public class Menu {
    
    public void signIn()
    {
        System.out.print("Enter your Name: ");
        //Check from DB whether username exists
        System.out.print("Enter your Password: ");
        //Check from DB whether password exists
    }
    public boolean signUp(String name, String password)
    {
        Users u1 = new Users();
        UserView uv1 = new UserView();
        UserController uc1 = new UserController(u1, uv1);
        uc1.set_userName(name);
        uc1.set_password(password);
        return uc1.add_user();
    }
}
