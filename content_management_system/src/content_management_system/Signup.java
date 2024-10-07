
package content_management_system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class Signup extends JFrame implements ActionListener{ // implements actionListener (for using birthday as password and name@123 as user id)
    
    JButton ok ;
    
    JTextField nameText, genderText , dobText;
    
    long random;
    
        String formno;
        String name;
        String gender;
        String dob;

    
    Signup(){
        
        
        setTitle("Content signup Page");
          
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel(" Application Form NO. " + random );
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel(" Personal Details " );
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel(" Name: " );
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        nameText = new JTextField();
        nameText.setFont(new Font("Raleway",Font.BOLD,14));
        nameText.setBounds(300,140,400,30);
        add(nameText);
       
        JLabel gender = new JLabel(" Gender: " );
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 190, 200, 30);
        add(gender);
        
        genderText = new JTextField();
        genderText.setFont(new Font("Raleway",Font.BOLD,14));
        genderText.setBounds(300,190,400,30);
        add(genderText);
        
        JLabel dob = new JLabel(" Date of Birth: " );
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        dobText = new JTextField();
        dobText.setFont(new Font("Raleway",Font.BOLD,14));
        dobText.setBounds(300,240,400,30);
        add(dobText);
        
        ok = new JButton("ok");
        ok.setBounds(400,400,50,20);
        ok.addActionListener(this);
        add(ok);
                
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
     public void actionPerformed(ActionEvent ae){
        
         formno = "" + random;
         name = nameText.getText();
         gender = genderText.getText();
         dob = dobText.getText();
         
         
            if(ae.getSource()== ok){
            JOptionPane.showMessageDialog(null, "OK pressed");
        
        try{
            conn c = new conn();
            String query ="insert into signup values('"+formno+"' , '"+name+"' , '"+gender+"' , '"+dob+"')";
            c.s.executeQuery(query);
        }catch(Exception e){
                System.out.println(e);
                }
            
            
            setVisible(false);
            new Login().setVisible(true);
        }
        
    }
    
    public static void main(String args[]) {
        new Signup();
    }
}
