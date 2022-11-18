/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Kevin Nathaniel
 */
public class Registrasi {
    User user;
    JTextField username, password, email;
    JRadioButton lakilaki, perempuan;
    JComboBox kategori;
      
    public Registrasi(){
        user = new User();
        Form();
    }
    
    public void Form(){
        JFrame frame = new JFrame("Registrasi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800);
        
        JLabel labelUsername = new JLabel("Username");
        labelUsername.setBounds(50, 30, 150, 50);
        
        username = new JTextField();
        username.setBounds(180, 45, 240, 20);
        
        JLabel labelPassword = new JLabel("Password");
        labelPassword.setBounds(50, 60, 150, 50);
        
        password = new JTextField();
        password.setBounds(180, 75, 240, 20);
        
        JLabel labelEmail = new JLabel("Email");
        labelEmail.setBounds(50, 90, 150, 50);
        
        email = new JTextField();
        email.setBounds(180, 105, 240, 20);
        
        JLabel labelGender = new JLabel("Jenis Kelamin");
        labelGender.setBounds(50, 120, 150, 50);
        
        lakilaki = new JRadioButton("Laki-laki");
        perempuan = new JRadioButton("Perempuan");
        lakilaki.setBounds(180, 120, 100, 50);
        perempuan.setBounds(280, 120, 125, 50);
        
        
        
        frame.add(labelUsername);
        frame.add(username);
        frame.add(labelPassword);
        frame.add(password);
        frame.add(labelEmail);
        frame.add(email);
        frame.add(labelGender);
        frame.add(lakilaki);
        frame.add(perempuan);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
