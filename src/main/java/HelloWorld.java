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
        greeter.setscore(2);
        System.out.println(greeter.getscore());
    }
}
