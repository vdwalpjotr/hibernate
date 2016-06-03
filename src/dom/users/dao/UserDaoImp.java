package dom.users.dao;

import dom.users.model.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by peter on 03-Jun-16.
 */

public class UserDaoImp implements UserDao {
    private SessionFactory sessionFactory;

    public UserEntity findByUsername(String username, String password){
        Logger log = Logger.getLogger("org.hibernate");
//        log.setLevel(Level.WARNING);


        this.sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        String sql = "FROM UserEntity WHERE username = :username AND pwd = :password";
        List<UserEntity> users = (List<UserEntity>) session
                .createQuery(sql)
                .setParameter("username", username)
                .setParameter("password", password)
                .list();

        session.close();
        if(users.size() > 0 ){

            return users.get(0);
        } else {
            return null;
        }
    }

}
