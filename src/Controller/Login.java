/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import View.MenuUtama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Kevin Nathaniel
 */
public class Login {
    User user;
    ImageIcon icon;
    JTextField username, password;
    
    public Login(){
        user = new User();
        Form();
    }
    
    public void Form(){
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        JLabel image = new JLabel(icon);
        image.setBounds(50, 0, 150, 50);
        
        icon = new ImageIcon("images/middle.gif");
               
        JLabel labelUsername = new JLabel("Username");
        labelUsername.setBounds(50, 30, 150, 50);
        
        username = new JTextField();
        username.setBounds(180, 45, 240, 20);
        
        JLabel labelPassword = new JLabel("Password");
        labelPassword.setBounds(50, 60, 150, 50);
        
        password = new JTextField();
        password.setBounds(180, 75, 240, 20);
        
        JButton login = new JButton("Login");
        login.setBounds(50, 120, 150, 50);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertData();
                checkDatabase();
                frame.dispose();
                try {
                    
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error!!");
                }
            }
        });
        
        JButton back = new JButton("Back");
        back.setBounds(50, 180, 150, 50);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new MenuUtama();
            }
        });
        
        frame.add(image);
        frame.add(labelUsername);
        frame.add(username);
        frame.add(labelPassword);
        frame.add(password);
        frame.add(login);
        frame.add(back);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public void insertData(){
        
    }
    
    public void checkDatabase(){
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        try {
            PreparedStatement stat = conn.con.prepareStatement("SELECT * FROM `user`");
            stat.setInt(1, user.getUserId());
            stat.setString(2, user.getUserName());
            stat.setString(3, user.getUserEmail());
            stat.setString(4, user.getUserGender());
            stat.setInt(5, user.getUserCategory().getCategoryId());
            stat.setString(6, user.getUserCategory().getCategoryName());
            stat.setInt(7, user.getUserFollowers());          
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil cek data ke database");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!! Gagal cek data ke database");
            System.out.println(e);
        }
        conn.disconnect();
    }
}
