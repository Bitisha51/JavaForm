package area;

import javax.swing.*;

public class AreaForm extends JFrame {
    JLabel labellength,labelbreadth,labelheight,labelvolofcuboid,labelareaofrectangle,labelperimeterofrectangle;
    JTextField fieldlength,fieldbreadth,fieldheight,fieldvolofcuboid,fieldareaofrectangle,fieldperimeterofrectangle;
    JButton btnclear,btncalculate;
    public AreaForm()
    {
        //length//
        labellength= new JLabel("length");
        labellength.setBounds(50,50,100,30);
        fieldlength= new JTextField();
        fieldlength.setBounds(170,50,100,30);

        //breadth//
        labelbreadth= new JLabel("breadth");
        labelbreadth.setBounds(50,100,100,30);
        fieldbreadth= new JTextField();
        fieldbreadth.setBounds(170,100,100,30);

        //height//
        labelheight= new JLabel("height");
        labelheight.setBounds(50,150,100,30);
        fieldheight= new JTextField();
        fieldheight.setBounds(170,150,100,30);

        //volume of cuboid//
        labelvolofcuboid= new JLabel("Volume of cuboid");
        labelvolofcuboid.setBounds(50,200,100,30);
        fieldvolofcuboid= new JTextField();
        fieldvolofcuboid.setBounds(170,200,100,30);

        //area of rectangle//
        labelareaofrectangle= new JLabel("Area of Rectangle");
        labelareaofrectangle.setBounds(50,250,100,30);
        fieldareaofrectangle= new JTextField();
        fieldareaofrectangle.setBounds(170,250,100,30);

        //perimeter of rectangle//
        labelperimeterofrectangle= new JLabel("Perimeter of rectangle");
        labelperimeterofrectangle.setBounds(50,300,100,30);
        fieldperimeterofrectangle= new JTextField();
        fieldperimeterofrectangle.setBounds(170,300,100,30);

        //btn//
        btncalculate= new JButton("Calculate");
        btncalculate.setBounds(170,350,100,30);
        btnclear= new JButton("Clear");
        btnclear.setBounds(270,350,100,30);

        //btnclear//
        btnclear.addActionListener(e ->{
            fieldlength.setText("");
            fieldbreadth.setText("");
            fieldheight.setText("");
            fieldvolofcuboid.setText("");
            fieldareaofrectangle.setText("");
            fieldperimeterofrectangle.setText("");

        });
        //btncalculate//
        btncalculate.addActionListener(e->{
            double length= Double.parseDouble(fieldlength.getText());
            double breadth= Double.parseDouble(fieldbreadth.getText());
            double height= Double.parseDouble(fieldheight.getText());
            double volofcuboid= length*breadth*height;
            double areaofrectangle = length*breadth;
            double perimeterofrectangle=2*(length+breadth);
            fieldvolofcuboid.setText(String.valueOf(volofcuboid));
            fieldareaofrectangle.setText(String.valueOf(areaofrectangle));
            fieldperimeterofrectangle.setText(String.valueOf(perimeterofrectangle));
        });
        //adding into frame//
        add(labellength);
        add(fieldlength);
        add(labelbreadth);
        add(fieldbreadth);
        add(labelheight);
        add(fieldheight);
        add(labelvolofcuboid);
        add(fieldvolofcuboid);
        add(labelareaofrectangle);
        add(fieldareaofrectangle);
        add(labelperimeterofrectangle);
        add(fieldperimeterofrectangle);
        add(btncalculate);
        add(btnclear);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){new AreaForm();}

}




