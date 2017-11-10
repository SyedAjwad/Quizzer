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
public class User {
    private String username;
    private String password;
    private String role;
    private int score;
    public void setusername(String username)
    {
        this.username = username;
    }
    public void setpassword(String password)
    {
        this.password = password;
    }
    public void setrole(String role)
    {
        this.role = role;
    }
    public void setscore(int score)
    {
        this.score = score;
    }
    public String getusername()
    {
        return username;
    }
    public String getpassword()
    {
        return password;
    }
    public String getrole()
    {
        return role;
    }
    public int getscore()
    {
        return score;
    }
}
