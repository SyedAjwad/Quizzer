/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.BoImpl;

import java.util.ArrayList;
import java.util.List;
import Quizzer.Bo.UsersBo;
import Quizzer.Dao.UsersDao;
import Quizzer.Model.Instructor;
import Quizzer.Model.Users;
import Quizzer.Model.Student;

/**
 *
 * @author AJ
 */
public class UsersBoImpl implements UsersBo{

    public List<Users> UserRoster;

    public UsersBoImpl() {
        UserRoster = new ArrayList<>();
    }

    @Override
    public int addUser(String user_name, String password) {
        Users tempUser = new Users();
        tempUser.set_username(user_name);

        UserRoster.add(tempUser);
        return UserRoster.indexOf(tempUser);
    }

    @Override
    public int addInstructor(int userIndex) {

        Instructor tempInstructor = new Instructor();
        UserRoster.add(userIndex,tempInstructor);
        return UserRoster.indexOf(tempInstructor);
    }

    @Override
    public int addStudent(int userIndex, int score) {

        Student tempStudent = new Student();
        tempStudent.set_score(score);
        UserRoster.add(userIndex, tempStudent);
        return UserRoster.indexOf(tempStudent);
    }

    @Override
    public void saveUsers() {
        UsersDao UserD = new UsersDao();
        UserD.saveUsers(UserRoster);
    }
}
