import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("CheckBox Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create CheckBoxes
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");

        // Add an ActionListener to CheckBoxes
        checkBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox1.isSelected()) {
                    System.out.println("Option 1 Selected");
                } else {
                    System.out.println("Option 1 Deselected");
                }
            }
        });

        checkBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox2.isSelected()) {
                    System.out.println("Option 2 Selected");
                } else {
                    System.out.println("Option 2 Deselected");
                }
            }
        });

        // Add CheckBoxes to the frame
        frame.setLayout(new FlowLayout());
        frame.add(checkBox1);
        frame.add(checkBox2);

        // Make frame visible
        frame.setVisible(true);
    }
}


import javax.swing.*;
        import java.awt.event.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("RadioButton Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create RadioButtons
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");

        // Create ButtonGroup to group RadioButtons
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        // Add ActionListener to RadioButtons
        radioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    System.out.println("Option 1 Selected");
                }
            }
        });

        radioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton2.isSelected()) {
                    System.out.println("Option 2 Selected");
                }
            }
        });

        // Add RadioButtons to the frame
        frame.setLayout(new FlowLayout());
        frame.add(radioButton1);
        frame.add(radioButton2);

        // Make frame visible
        frame.setVisible(true);
    }
}
