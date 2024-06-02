package StudentForm;

import javax.swing.*;
import java.sql.*;


public class BcaForm extends JFrame{
    JLabel labelid,labelname,labelemail,labelgender,labelfaculty;
    JTextField fieldid,fieldname,fieldemail,fieldfaculty;
    JButton btninsert,btnreset,btndisplay,btndelete,btnupdate;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JComboBox jc;
    public BcaForm()
    {
        //id//
        labelid=new JLabel("id");
        labelid.setBounds(50,50,100,30);
        fieldid=new JTextField();
        fieldid.setBounds(170,50,150,30);
        //name//
        labelname= new JLabel("Name");
        labelname.setBounds(50,100,100,30);
        fieldname= new JTextField();
        fieldname.setBounds(170,100,150,30);

        //email//
        labelemail= new JLabel("Email");
        labelemail.setBounds(50,150,100,30);
        fieldemail= new JTextField();
        fieldemail.setBounds(170,150,150,30);

        //gender//
        labelgender= new JLabel("Gender");
        labelgender.setBounds(50,200,100,30);
        r1= new JRadioButton("A.Male");
        r2= new JRadioButton("B.Female");
        r1.setBounds(170,200,100,30);
        r2.setBounds(270,200,100,30);
        bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        //faculty//
        labelfaculty= new JLabel("Faculty");
        labelfaculty.setBounds(50,250,100,30);
        String facultydetails[] ={"BCA","BBM","BIT","BSC.CSIT"};
        jc =new JComboBox(facultydetails);
        jc.setBounds(170,250,150,30);

        btninsert= new JButton("Insert");
        btninsert.setBounds(170,300,100,30);
        btnreset= new JButton("Reset");
        btnreset.setBounds(270,300,100,30);
        btndelete=new JButton("Delete");
        btndelete.setBounds(170,350,100,30);
        btnupdate=new JButton("Update");
        btnupdate.setBounds(270,350,100,30);
        btndisplay=new JButton("Display");
        btndisplay.setBounds(170,400,100,30);

        btninsert.addActionListener(e -> {
            int id=Integer.parseInt(fieldid.getText());
            String name=fieldname.getText();
            String email=fieldemail.getText();
            String gender=r1.isSelected()?"male":"female";
            String faculty=(String) jc.getSelectedItem();
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/BCA", "root", "");
                Statement stmt=conn.createStatement();
                String insertsql = "Insert into student-info values ('"+id+"','"+name+"','"+email+"','"+gender+"','"+faculty+"')";
                stmt.executeUpdate(insertsql);
                JOptionPane.showMessageDialog(btninsert,"Inserted Successfully");


            }catch (Exception ex)
            {
                System.out.println(ex.getClass()+ex.getMessage());
            }
        });
        btnreset.addActionListener(e ->{
            fieldid.setText(null);
            fieldname.setText(null);
            fieldemail.setText(null);

        });


        btndelete.addActionListener(e->{
            int id =  Integer.parseInt(fieldid.getText());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BCA", "root", "");
                Statement stmt = conn.createStatement();
                String deletesql = " delete from student-info where id = '"+id+"' ";
                stmt.executeUpdate(deletesql);
                JOptionPane.showMessageDialog(btninsert,"Deleted Successfully");


            }catch (Exception ex)
            {
                System.out.println(ex.getClass()+ex.getMessage());
            }
        });

        btnupdate.addActionListener(e->{
            int id =  Integer.parseInt(fieldid.getText());
            String name = fieldname.getText();
            String email= fieldemail.getText();
            String gender= r1.isSelected() ? "male" : "female";
            String faculty = (String) jc.getSelectedItem();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BCA", "root", "");
                Statement stmt = conn.createStatement();
                String insertsql = "update student-info set name = '"+name+"' , email = '"+email+"', gender = '"+gender+"',faculty = '"+faculty+"'";
                stmt.executeUpdate(insertsql);
                JOptionPane.showMessageDialog(btninsert,"Updated Successfully");


            }catch (Exception ex)
            {
                System.out.println(ex.getClass()+ex.getMessage());
            }
        });

        btndisplay.addActionListener(e ->{
            String name = fieldname.getText();
            String email= fieldemail.getText();
            String gender= r1.isSelected() ? "male" : "female";
            String faculty = (String) jc.getSelectedItem();
            System.out.println("student details");
            System.out.println("Name="+name);
            System.out.println("email="+email);
            System.out.println("gender="+gender);
            System.out.println("faculty="+faculty);
            JOptionPane.showMessageDialog(btndisplay,"Display Successfully");

        });


        //adding into frame//
        add(labelid);
        add(fieldid);
        add(labelname);
        add(fieldname);
        add(labelemail);
        add(fieldemail);
        add(labelgender);
        add(r1);
        add(r2);
        add(labelfaculty);
        add(jc);
        add(btndisplay);
        add(btnreset);
        add(btndelete);
        add(btnupdate);
        add(btninsert);
        setSize(500,500);
        setLayout(null);
        //setResizeable(false);//
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new BcaForm();
    }
}

