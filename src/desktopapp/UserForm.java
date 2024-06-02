package desktopapp;

import javax.swing.*;

public class UserForm extends JFrame {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;
    public UserForm()
    {
        l1= new JLabel("Name:");
        l1.setBounds(50,50,100,30);
        t1= new JTextField();
        t1.setBounds(180,50,150,30);

        l2= new JLabel("RollNo:");
        l2.setBounds(50,100,100,30);
        t2= new JTextField();
        t2.setBounds(180,100,150,30);

        l3= new JLabel("Email:");
        l3.setBounds(50,150,100,30);
        t3= new JTextField();
        t3.setBounds(180,150,150,30);

        l4= new JLabel("Faculty:");
        l4.setBounds(50,200,100,30);
        t4= new JTextField();
        t4.setBounds(180,200,150,30);

        b1= new JButton("Submit");
        b1.setBounds(240,250,100,30);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(b1);

        setSize(1000,1000);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){new UserForm();}

}
