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
    public void set_username(String username)
    {
        this.username = username;
    }
    public void set_password(String password)
    {
        this.password = password;
    }
    public void set_role(String role)
    {
        this.role = role;
    }
    public void set_score(int score)
    {
        this.score = score;
    }
    public String get_username()
    {
        return username;
    }
    public String get_password()
    {
        return password;
    }
    public String get_role()
    {
        return role;
    }
    public int get_score()
    {
        return score;
    }
    public boolean add_user()
    {
        return true;
    }
}
