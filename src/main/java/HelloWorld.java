

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
public class HelloWorld {
    
    public static void main(String[] args) {
        Quizzer.Model.Users greeter = new Quizzer.Model.Users();
        Quizzer.View.UserView viewer = new Quizzer.View.UserView();
        Quizzer.Controller.UserController controller = new Quizzer.Controller.UserController(greeter, viewer);
        controller.updateView();
        greeter.set_username("Ajwad");
        controller.set_password("password");
        controller.updateView();
    }
}
