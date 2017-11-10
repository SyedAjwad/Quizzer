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
public class HelloWorld {
    
    public static void main(String[] args) {
        User greeter = new User();
        UserView viewer = new UserView();
        UserController controller = new UserController(greeter, viewer);
        controller.updateView();
        controller.setuserName("Ajwad");
        controller.updateView();
    }
}
