

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
        Quizzer.User greeter = new Quizzer.User();
        Quizzer.UserView viewer = new Quizzer.UserView();
        Quizzer.UserController controller = new Quizzer.UserController(greeter, viewer);
        controller.updateView();
        greeter.setusername("Ajwad");
        controller.setpassword("password");
        controller.setrole("Student");
        controller.setscore(0);
        controller.updateView();
    }
}
