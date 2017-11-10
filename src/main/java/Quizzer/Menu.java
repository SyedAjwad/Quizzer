/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer;

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
    public void SignUp()
    {
        String name = "";
        String password = "";
        int role = 0;
        User u1 = new User();
        UserView uv1 = new UserView();
        UserController uc1 = new UserController(u1, uv1);
        System.out.print("Enter your Name: ");
        System.out.print("Enter your Password: ");
        System.out.print("Select Your Role: "
                + "1. Instructor"
                + "2. Student");
        do
        {
        System.out.print("Please Select Correct Role: "
                + "1. Instructor"
                + "2. Student");
        if(role == 1)
        {
            
        }
        else if(role == 2)
        {
            
        }
        } while((role !=1) || (role!=2));
        System.out.print("Congratulations. You Have successfully signed up");
    }
}
