package com.ab.hibernate_without_conf_and_mappingFILE;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  setting the  db configurations through properties
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
        Person person = new Person(26, "James", "Gosling"); 
    	
    	Session  session  = HibernateUtil.getSession();
    	Transaction  tx = session.beginTransaction();
         session.save(person);
         HibernateUtil.flushNcommit(session, tx);
         session.close();
    }//main
}//Test
