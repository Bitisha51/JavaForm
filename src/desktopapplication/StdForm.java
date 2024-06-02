package desktopapplication;

import javax.swing.*;
public class StdForm extends JFrame {
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JPasswordField p1;
    JButton b1;

    public StdForm()
    {
        //for label ID//
        l1= new JLabel("ID:");
        l1.setBounds(50,50,100,30);
        t1= new JTextField();
        t1.setBounds(180,50,150,30);

        //for label Username//
        l2= new JLabel("Username:");
        l2.setBounds(50,100,100,30);
        t2= new JTextField();
        t2.setBounds(180,100,150,30);

        //for label password//
        l3= new JLabel("Password:");
        l3.setBounds(50,150,100,30);
        p1= new JPasswordField();
        p1.setBounds(180,150,150,30);

        //for button//
        b1= new JButton("Login");
        b1.setBounds(240,200,100,30);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(p1);
        add(b1);

        //for size of frame//
        setSize(1000,1000);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new StdForm();
    }
}
