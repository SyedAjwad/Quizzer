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
public class UserController {
    private User model;
    private UserView view;

   public UserController(User model, UserView view){
       this.model = model;
       this.view = view;
   }
   public void set_userName(String name){
      model.set_username(name);		
   }

   public String get_username(){
      return model.get_username();		
   }

   public void set_password(String password){
      model.set_password(password);		
   }

   public void set_role(String role){
      model.set_role(role);	
   }
   
   public String get_role(){
      return model.get_role();		
   }
   
   public void set_score(int score){
      model.set_score(score);	
   }
   
   public int get_score(){
      return model.get_score();		
   }

   public void updateView(){				
      view.printInformation(model.get_username(), model.get_role(), model.get_score());
   }
}
