package com.itshaala.Dao;

import com.itshaala.Util.HibernateUtil;
import com.itshaala.model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class CourseDao {
    public void addCourse(Course course){
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(course);
        transaction.commit();
        session.close();
        System.out.println("course saved succefully");
    }

    public void updateCourse(Course course) {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(course);
        transaction.commit();
        session.close();
        System.out.println("course update succesfully");
    }

    public void deleteCourse(int courseId) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Course course = session.get(Course.class, courseId);
        Transaction transaction = session.beginTransaction();
        session.delete(course);
        transaction.commit();
        session.close();
        System.out.println("course deleted sucessfully");
    }


}
