package admin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by peter on 02-Jun-16.
 */
public class LoginScreen extends JFrame {

    public LoginScreen(){
        setSize(300,300);
        JLabel usernameLabel = new JLabel("Username: ");
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
            }
        });

        panel.add(usernameLabel);
        panel.add(username);
        panel2.add(passwordLabel);
        panel2.add(password);
        panel3.add(button);
        this.add(panel);
        this.add(panel2);
        this.add(panel3);
        this.setVisible(true);
    }

    private boolean checkUser(String username, char[] password){

        return true;
    }
}
