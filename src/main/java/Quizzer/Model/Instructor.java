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
@DiscriminatorValue("Instructor")
public class Instructor extends Users{
    
}
