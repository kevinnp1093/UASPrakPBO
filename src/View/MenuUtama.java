/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LihatDataPengguna;
import Controller.Login;
import Controller.Registrasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Kevin Nathaniel
 */
public class MenuUtama {
    public MenuUtama(){
        JFrame frame = new JFrame("Main Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        
        JButton Login = new JButton("Login");
        Login.setBounds(150, 40, 100, 50);
        Login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Login();
            }
        });
        
        JButton Registrasi = new JButton("Registrasi");
        Registrasi.setBounds(150, 110, 100, 50);
        Registrasi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Registrasi();
            }
        });
        
        JButton lihatDataPengguna = new JButton("Lihat Data Pengguna");
        lihatDataPengguna.setBounds(100, 180, 200, 50);
        lihatDataPengguna.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new LihatDataPengguna();
            }
        });
        
        frame.add(Login);
        frame.add(Registrasi);
        frame.add(lihatDataPengguna);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
