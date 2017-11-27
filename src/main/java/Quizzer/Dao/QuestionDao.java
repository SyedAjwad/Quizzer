/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzer.Dao;

import Quizzer.Model.Question;
import Quizzer.Util.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author AJ
 */
public class QuestionDao {
    static ServiceRegistry  serviceRegistry ;
	static SessionFactory sessionFactory;
    static Session session;
	
	public QuestionDao(){
		// TODO Auto-generated method stub
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        //nested Transactions are not supported. Once you have started transaction here
        // can't do that in the saveEmployee method.
        //session.beginTransaction();
	}
	
	public void saveQuestion(List<Question> newQuestion){
		Transaction t=session.beginTransaction();  
            for (Question newQuestion1 : newQuestion) {
                session.persist((Question) newQuestion1);
            }
      		t.commit(); 
	}

	public void printQuestion()
	{
		List<Question> question = session.createQuery("from Question").list();
		Iterator<Question> it = question.iterator();
		Question tempQuestion;
		for(;it.hasNext(); )
		{
			tempQuestion = it.next();
			System.out.println(tempQuestion);
		}
	}
	
	public void closeSession()
	{
        session.close();
        sessionFactory.close();
	}
}
