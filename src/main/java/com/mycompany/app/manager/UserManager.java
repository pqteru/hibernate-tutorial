package com.mycompany.app.manager;

import com.mycompany.app.model.User;
import com.mycompany.app.utils.HibernateUtil;
import org.hibernate.Session;

import java.sql.Timestamp;
import java.util.*;

public class UserManager {
    public static void main(String[] args) {
        UserManager mgr = new UserManager();
        mgr.addUser("test", "test");
        HibernateUtil.getSessionFactory().close();
    }

    private void addUser(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        // set current timestamp
        user.setCreate_time(new Timestamp(new Date().getTime()));
        session.save(user);

        session.getTransaction().commit();
    }

    private List listUsers() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List result = session.createQuery("from USER").list();
        session.getTransaction().commit();
        return result;
    }
}