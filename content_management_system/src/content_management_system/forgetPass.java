
package content_management_system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class forgetPass extends JFrame implements ActionListener{
    
    JButton done;
    forgetPass(){
        setLayout(null);
        
        JLabel text = new JLabel("Forget Password");
        text.setFont(new Font("Raleway",Font.BOLD,38));
        text.setBounds(270, 20, 600, 40);
        add(text);
        
        JLabel id = new JLabel(" enter ID: " );
        id.setFont(new Font("Raleway",Font.BOLD,20));
        id.setBounds(100, 140, 250, 30);
        add(id);
        
        JTextField idText = new JTextField();
        idText.setFont(new Font("Raleway",Font.BOLD,14));
        idText.setBounds(320,140,400,30);
        add(idText);
        
        JLabel birth = new JLabel(" enter DOB: " );
        birth.setFont(new Font("Raleway",Font.BOLD,20));
        birth.setBounds(100, 190, 250, 30);
        add(birth);
        
        JTextField dobText = new JTextField();
        dobText.setFont(new Font("Raleway",Font.BOLD,14));
        dobText.setBounds(320,190,400,30);
        add(dobText);
        
        
        JLabel resetpass = new JLabel(" enter new-password: " );
        resetpass.setFont(new Font("Raleway",Font.BOLD,20));
        resetpass.setBounds(100, 240, 220, 30);
        add(resetpass);
        
        JTextField newpass = new JTextField();
        newpass.setFont(new Font("Raleway",Font.BOLD,14));
        newpass.setBounds(320,240,400,30);
        add(newpass);
        
        done = new JButton("DONE");
        done.setBounds(400,400,100,30);
        done.addActionListener(this);
        add(done);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
        
    }
    
     public void actionPerformed(ActionEvent ae){
       if(ae.getSource()== done){
           JOptionPane.showMessageDialog(null, "password reset");
            setVisible(false);
            new Login().setVisible(true);
        }
        
    }
    
    public static void main(String args[]) {
       new forgetPass();
    }
}
