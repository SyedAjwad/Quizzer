/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.Model;
import javax.persistence.*;
/**
 *
 * @author AJ
 */
@Entity
@DiscriminatorValue("Student")
public class Student extends Users{
    
    @Column(name = "Score")
    private int score;
    
    public void set_score(int score)
    {
        this.score = score;
    }
    public int get_score()
    {
        return score;
    }
}
