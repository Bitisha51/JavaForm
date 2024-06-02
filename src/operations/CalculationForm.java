package operations;

import javax.swing.*;

public class CalculationForm extends JFrame {
    JLabel labelnum1,labelnum2,labeladdition,labelsubtraction,labelmultiplication,labeldivision;
    JTextField fieldnum1,fieldnum2,fieldaddition,fieldsubtraction,fieldmultiplication,fielddivision;
    JButton btncalculate,btnclear;
    public CalculationForm()
    {
        //num1//
        labelnum1= new JLabel("Num1");
        labelnum1.setBounds(50,50,100,30);
        fieldnum1= new JTextField();
        fieldnum1.setBounds(170,50,150,30);

        //num2//
        labelnum2= new JLabel("Num2");
        labelnum2.setBounds(50,100,100,30);
        fieldnum2= new JTextField();
        fieldnum2.setBounds(170,100,150,30);

        //addition//
        labeladdition= new JLabel("Addition");
        labeladdition.setBounds(50,150,100,30);
        fieldaddition= new JTextField();
        fieldaddition.setBounds(170,150,150,30);

        //subtraction//
        labelsubtraction= new JLabel("Subtraction");
        labelsubtraction.setBounds(50,200,100,30);
        fieldsubtraction= new JTextField();
        fieldsubtraction.setBounds(170,200,150,30);

        //multiplication//
        labelmultiplication= new JLabel("Multiplication");
        labelmultiplication.setBounds(50,250,100,30);
        fieldmultiplication= new JTextField();
        fieldmultiplication.setBounds(170,250,150,30);

        //division//
        labeldivision= new JLabel("Division");
        labeldivision.setBounds(50,300,100,30);
        fielddivision= new JTextField();
        fielddivision.setBounds(170,300,150,30);

        //btn//
        btncalculate= new JButton("Calculate");
        btncalculate.setBounds(170,350,100,30);
        btnclear= new JButton("Clear");
        btnclear.setBounds(270,350,100,30);

        //btnclear//
        btnclear.addActionListener(e ->{
            fieldnum1.setText("");
            fieldnum2.setText("");
            fieldaddition.setText("");
            fieldsubtraction.setText("");
            fieldmultiplication.setText("");
            fielddivision.setText("");

        });
        //btncalculate//     
        btncalculate.addActionListener(e->{
            double num1= Double.parseDouble(fieldnum1.getText());
            double num2= Double.parseDouble(fieldnum2.getText());
            double addition= num1+num2;
            double subtraction= num1-num2;
            double multiplication=num1*num2;
            double division=num1/num2;
            fieldaddition.setText(String.valueOf(addition));
            fieldsubtraction.setText(String.valueOf(subtraction));
            fieldmultiplication.setText(String.valueOf(multiplication));
            fielddivision.setText(String.valueOf(division));
        });
        //adding into frame//
        add(labelnum1);
        add(fieldnum1);
        add(labelnum2);
        add(fieldnum2);
        add(labeladdition);
        add(fieldaddition);
        add(labelsubtraction);
        add(fieldsubtraction);
        add(labelmultiplication);
        add(fieldmultiplication);
        add(labeldivision);
        add(fielddivision);
        add(btncalculate);
        add(btnclear);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){new CalculationForm();}

}
