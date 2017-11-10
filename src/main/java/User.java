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
    String username;
    String password;
    String role;
    int score;
    public void setscore(int score)
    {
        this.score = score;
    }
    public int getscore()
    {
        return score;
    }
}
