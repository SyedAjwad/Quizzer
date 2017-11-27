package Quizzer.Model;

import java.io.Serializable;
import javax.persistence.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
@Entity
@Table(name = "Users")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="role",discriminatorType=DiscriminatorType.STRING)
public class Users implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int User_id;
    private String username;
    private String password;
    public void set_username(String username)
    {
        this.username = username;
    }
    public void set_user_id(int User_id)
    {
        this.User_id = User_id;
    }
    public void set_password(String password)
    {
        this.password = password;
    }
    public int get_user_id()
    {
        return User_id;
    }
    public String get_username()
    {
        return username;
    }
    public String get_password()
    {
        return password;
    }
    public boolean add_user()
    {
        return true;
    }
}
