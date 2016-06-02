package admin.ui;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.swing.*;
import util.HibernateUtil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by peter on 02-Jun-16.
 */
public class LoginScreen extends JFrame {

    public LoginScreen(){
        //Close all processes when clicking on 'x' in the frame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setDefaultCloseOperation(1);
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel error = new JLabel("");
        error.setForeground(Color.red);
        JTextField username = new JTextField(25);
        JLabel passwordLabel = new JLabel("Password :");
        JPasswordField password = new JPasswordField(25);
        this.setLayout(new GridLayout(3, 1));
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JButton button = new JButton("Login");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               boolean check = checkUser(username.getText(), password.getPassword());
                if(check == true){
                    setVisible(false);
                    dispose();
                    new MainScreen();
                }
                if(check == false){
                    error.setText("Username or password incorrect");
                }
            }
        });

        panel.add(usernameLabel);
        panel.add(username);
        panel.add(error);
        panel2.add(passwordLabel);
        panel2.add(password);
        panel3.add(button);
        this.add(panel);
        this.add(panel2);
        this.add(panel3);
        this.setVisible(true);
    }

    private boolean checkUser(String username, char[] password){
        boolean check = false;
        String selectQuery = "SELECT username, pwd FROM UserEntity WHERE username = :username AND pwd = :password";

        //Set de logger op warning only level
        Logger log = Logger.getLogger("org.hibernate");
        log.setLevel(Level.WARNING);
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery(selectQuery);
        query.setParameter("username", username);
        query.setParameter("password", new String(password));
        List results = query.list();
        if(!results.isEmpty()){
            check = true;

        }
        for(Object res : results){
            Object[] fields = (Object[]) res;
            System.out.println(fields[0]);
        }
        System.out.println(results);
        session.close();

        return check;
    }
}
