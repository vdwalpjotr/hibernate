package admin.ui;

import admin.main.UserSession;
import dom.users.dao.UserDao;
import dom.users.dao.UserDaoImp;
import dom.users.model.UserEntity;
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
    private UserSession userSession;
    public LoginScreen(UserSession userSession){
        this.userSession = userSession;
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
               checkUser(username.getText(), password.getPassword());
                if(userSession.getLoggedIn() == true){
                    setVisible(false);
                    dispose();
                    new MainScreen(userSession);
                }
                if(userSession.getLoggedIn() == false){
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

    private void checkUser(String username, char[] password){

        if(!username.isEmpty() && password.length != 0) {
            UserEntity user = new UserDaoImp().findByUsername(username, new String(password));
            if (user != null) {
                userSession.setLoggedIn(true);
                userSession.setUser(user);
            }
        }
    }
}
