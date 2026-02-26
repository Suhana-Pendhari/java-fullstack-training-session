import java.awt.*;
import java.awt.event.*;

public class adns1 extends Frame
{
    Button b1,b2,b3,b4;
    TextField t1,t2,t3;
    Label l1,l2,l3;

    public adns1()
    {
        l1=new Label("enter a number");
        l2=new Label("enter another number");
        l3=new Label("solution");

        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);

        b1=new Button("Add");
        b2=new Button("substract");
        b3=new Button("Multiply");
        b4=new Button("Divide");

        b1.addActionListener(e -> {
            double x = Double.parseDouble(t1.getText().trim());
            double y = Double.parseDouble(t2.getText().trim());
            double z = x + y;
            t3.setText(String.valueOf(z));
        });

        b2.addActionListener(e -> {
            double x = Double.parseDouble(t1.getText().trim());
            double y = Double.parseDouble(t2.getText().trim());
            double z = x - y;
            t3.setText(String.valueOf(z));
        });

        b3.addActionListener(e -> {
            double x = Double.parseDouble(t1.getText().trim());
            double y = Double.parseDouble(t2.getText().trim());
            double z = x * y;
            t3.setText(String.valueOf(z));
        });

        b4.addActionListener(e -> {
            double x = Double.parseDouble(t1.getText().trim());
            double y = Double.parseDouble(t2.getText().trim());
            double z = x / y;
            t3.setText(String.valueOf(z));
        });

        setLayout(new FlowLayout());
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2); add(b3); add(b4);
    }

    public static void main(String[] ar)
    {
        adns1 a1=new adns1();
        a1.pack();
        a1.setVisible(true);
    }
}
