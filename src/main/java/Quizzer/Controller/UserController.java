package Quizzer.Controller;

import Quizzer.View.UserView;
import Quizzer.Model.Users;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
public class UserController {
    private Users model;
    private UserView view;

   public UserController(Users model, UserView view){
       this.model = model;
       this.view = view;
   }
   public void set_user_id(int User_id)
    {
        this.model.set_user_id(User_id);
    }
   public void set_userName(String name){
      model.set_username(name);		
   }
   public int get_user_id()
    {
        return this.model.get_user_id();
    }
   public String get_username(){
      return model.get_username();		
   }

   public void set_password(String password){
      model.set_password(password);		
   }

   public boolean add_user(){
       return model.add_user();
   }

   public void updateView(){				
      view.print_userInformation(model.get_user_id(),model.get_username());
   }
}
