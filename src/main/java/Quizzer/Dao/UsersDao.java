package Quizzer.Dao;

import Quizzer.Util.HibernateUtil;
import Quizzer.Model.Users;
import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;

public class UsersDao {
	static ServiceRegistry  serviceRegistry ;
	static SessionFactory sessionFactory;
    static Session session;
	
	public UsersDao(){
		// TODO Auto-generated method stub
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        //nested Transactions are not supported. Once you have started transaction here
        // can't do that in the saveEmployee method.
        //session.beginTransaction();
	}
	
	public void saveUsers(List<Users> newUser){
		Transaction t=session.beginTransaction();  
            for (Users newUser1 : newUser) {
                session.persist((Users) newUser1);
            }
      		t.commit(); 
	}

	public void printUsers()
	{
		List<Users> user = session.createQuery("from Users").list();
		Iterator<Users> it = user.iterator();
		Users tempUser;
		for(;it.hasNext(); )
		{
			tempUser = it.next();
			System.out.println(tempUser);
		}
	}
	
	public void closeSession()
	{
        session.close();
        sessionFactory.close();
	}
}
