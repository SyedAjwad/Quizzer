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
   public void setuserName(String name){
      model.setusername(name);		
   }

   public String getusername(){
      return model.getusername();		
   }

   public void setpassword(String password){
      model.setpassword(password);		
   }

   public void setrole(String role){
      model.setrole(role);	
   }
   
   public String getrole(){
      return model.getrole();		
   }
   
   public void setscore(int score){
      model.setscore(score);	
   }
   
   public int getscore(){
      return model.getscore();		
   }

   public void updateView(){				
      view.printInformation(model.getusername(), model.getrole(), model.getscore());
   }
}
