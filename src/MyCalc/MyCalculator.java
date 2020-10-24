package MyCalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyCalculator implements ActionListener {
    JButton one,two,three,four,five,six,seven,eight,nine,decimal,zero,clear,cross,percent,plus,minus,mult,divide,
            result,no;
    JTextField tf;
    MyCalculator() {
        JFrame f = new JFrame("Calculator");
        SwingUtilities.updateComponentTreeUI(f);
        f.invalidate();
        f.validate();
        f.repaint();

        tf =  new JTextField();
        tf.setBounds(10,10,290,40);
        tf.setBackground(Color.red);
        clear = new JButton("AC");
        cross = new JButton("C");
        percent = new JButton("%");
        divide =  new JButton("/");
        seven = new JButton("7");
        eight=  new JButton("8");
        nine = new JButton("9");
        mult = new JButton("*");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        minus =  new JButton("-");
        one = new JButton("1");
        two = new JButton("2");
        three =  new JButton("3");
        plus =  new JButton("+");
        no = new JButton("no");
        zero =  new JButton("0");
        decimal = new JButton(".");
        result=  new JButton("=");
        clear.setBounds(10,50,70,70);
        cross.setBounds(80,50,70,70);
        percent.setBounds(150,50,70,70);
        divide.setBounds(220,50,70,70);
        seven.setBounds(10,120,70,70);
        eight.setBounds(80,120,70,70);
        nine.setBounds(150,120,70,70);
        mult.setBounds(220,120,70,70);
        four.setBounds(10,190,70,70);
        five.setBounds(80,190,70,70);
        six.setBounds(150,190,70,70);
        minus.setBounds(220,190,70,70);
        one.setBounds(10,260,70,70);
        two.setBounds(80,260,70,70);
        three.setBounds(150,260,70,70);
        plus.setBounds(220,260,70,70);
        no.setBounds(10,330,70,70);
        zero.setBounds(80,330,70,70);
        decimal.setBounds(150,330,70,70);
         result.setBounds(220,330,70,70);
         clear.addActionListener(this);
         cross.addActionListener(this);
        percent.addActionListener(this);
        divide.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        mult.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        minus.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        plus.addActionListener(this);
        zero.addActionListener(this);
        decimal.addActionListener(this);
        result.addActionListener(this);



        f.add(tf);
        f.add(clear);
        f.add(cross);
        f.add(percent);f.add(divide);f.add(seven);f.add(eight);f.add(nine);f.add(mult);f.add(four);
        f.add(five);f.add(six);f.add(minus);f.add(one);f.add(two);f.add(three);f.add(plus);
        f.add(no);f.add(zero);f.add(decimal);f.add(result);

     f.setSize(300,450);
        f.setLayout(null);
        f.setVisible(true);


    }
    public static void main(String[] args) {
        new MyCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == one) {
            System.out.println("one pressed");
            tf.setText(tf.getText() + "1");
        }
        else if(e.getSource() == two) {
            tf.setText(tf.getText() + "2");
        }
        else if(e.getSource() == three) {
            tf.setText(tf.getText() + "3");
        }
        else if(e.getSource() == four) {
            tf.setText(tf.getText() + "4");
        }
        else if(e.getSource() == five) {
            tf.setText(tf.getText() + "5");
        }
        else if(e.getSource() == six) {
            tf.setText(tf.getText() + "6");
        } else if(e.getSource() == seven) {
            tf.setText(tf.getText() + "7");
        } else if(e.getSource() == eight) {
            tf.setText(tf.getText() + "8");
        }
        else if(e.getSource() == nine) {
            tf.setText(tf.getText() + "9");
        }
        else if(e.getSource() == zero) {
            tf.setText(tf.getText() + "0");
        }
        else if(e.getSource() == decimal) {
            tf.setText(tf.getText() + ".");
        }
        else if(e.getSource() == plus) {
            tf.setText(tf.getText() + "+");
        }
        else if(e.getSource() == minus) {
            tf.setText(tf.getText() + "-");
        }
        else if(e.getSource() == percent) {
            tf.setText(tf.getText() + "%");
        }
        else if(e.getSource() == mult) {
            tf.setText(tf.getText() + "*");
        }
        else if(e.getSource() == clear) {
            tf.setText("");
        }
        else if(e.getSource() == cross) {
            StringBuffer str = new StringBuffer(tf.getText());
            str.deleteCharAt(str.length()-1);
            tf.setText(str.toString());
        }



    }
}
