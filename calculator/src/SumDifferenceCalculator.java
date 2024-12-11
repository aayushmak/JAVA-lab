import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumDifferenceCalculator extends JFrame {

    private JTextField textField1, textField2;
    private JLabel resultLabel;

    public SumDifferenceCalculator() {
        // Create components
        textField1 = new JTextField(10);  // Input field for first number
        textField2 = new JTextField(10);  // Input field for second number
        resultLabel = new JLabel("Result will be displayed here.");

        JButton calculateButton = new JButton("Calculate");

        // Add components to the frame
        setLayout(new FlowLayout());
        add(new JLabel("Enter first number: "));
        add(textField1);
        add(new JLabel("Enter second number: "));
        add(textField2);
        add(calculateButton);
        add(resultLabel);

        // Add mouse listener to the button
        calculateButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Calculate and display sum on mouse press
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int sum = num1 + num2;
                resultLabel.setText("Sum: " + sum);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Calculate and display difference on mouse release
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int difference = num1 - num2;
                resultLabel.setText("Difference: " + difference);
            }
        });

        // Set frame properties
        setTitle("Sum and Difference Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SumDifferenceCalculator();
    }
}

