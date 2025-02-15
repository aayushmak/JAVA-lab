import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.*;

import static javax.swing.BorderFactory.createEtchedBorder;


public class QuizText extends JFrame implements ActionListener {
    static int a = 0, b = 0, data = 0, five = 0, pole = 0;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    private JLabel line1;
    private JLabel text2;
    private JLabel line2;
    private JLabel ans;
    private JLabel score;
    private JLabel credit;
    private JPanel pnl1, pnl2;
    String message;



    public  QuizText() {
        super("Quiz Game");
        pnl1 = new JPanel(null);
        pnl1.setSize(1800,800);
        pnl1.setLayout(null);
//            pnl1.setBackground(Color.black);

        add(pnl1);
        JPanel backgroundPanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon background = new ImageIcon("img2.jpg");
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        backgroundPanel.setSize(1500,800);
        backgroundPanel.setLayout(null);
        pnl1.add(backgroundPanel);


        credit = new JLabel("Simple Quiz Game");
        credit.setBounds(420, 100, 500, 100);
        credit.setForeground(Color.decode("#8bbfed"));
        credit.setFont(new Font("American Typewriter", Font.BOLD, 50));
        credit.setBorder(BorderFactory.createMatteBorder(7,7,7,7,Color.decode("#94a2cf")));
        credit.setHorizontalAlignment(SwingConstants.CENTER);
        credit.setVerticalAlignment(SwingConstants.CENTER);
//            credit.setBorder(BorderFactory.createCompoundBorder(one,two));
//            pnl1.add(credit);
        backgroundPanel.add(credit);

        pnl2 = new JPanel();
        pnl2.setLayout(null);
        pnl2.setBounds(420,100,500,100);
        pnl2.setBackground(Color.white);
//       pnl1.add(pnl2);
        backgroundPanel.add(pnl2);


        JLabel text = new JLabel("Play And Win");
        text.setBounds(460, 0, 650, 100);
        text.setForeground(Color.decode("#94a2cf"));
        text.setFont(new Font("American Typewriter", Font.BOLD, 60));
//            pnl1.add(text);
        backgroundPanel.add(text);
////
//            line1 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//            line1.setBounds(0, 200, 2000, 100);
//            line1.setForeground(Color.white);
//            backgroundPanel.add(line1);

        text2 = new JLabel();
        text2.setBounds(180, 290, 1000, 100);
        text2.setForeground(Color.BLACK);
        text2.setFont(new Font("American Typewriter", Font.PLAIN, 30));
        text2.setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.decode("#023e8a")));
        text2.setHorizontalAlignment(SwingConstants.CENTER);
        text2.setVerticalAlignment(SwingConstants.CENTER);
//            pnl1.add(text2);
        backgroundPanel.add(text2);
//
//            line2 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//            line2.setBounds(0, 350, 2000, 100);
//            line2.setForeground(Color.black);
//            backgroundPanel.add(line2);

        btn1 = new JButton();
        btn1.setBackground(Color.white);
        btn1.setBounds(20, 450, 400, 50);
        btn1.addActionListener((ActionListener) this);
        backgroundPanel.add(btn1);

        btn2 = new JButton();
        btn2.setBackground(Color.white);
        btn2.setBounds(800, 450, 400, 50);
        btn2.addActionListener(this);
//           pnl1.add(btn2);
        backgroundPanel.add(btn2);

        btn3 = new JButton();
        btn3.setBackground(Color.white);
        btn3.setBounds(20, 550, 400, 50);
        btn3.addActionListener(this);
//            pnl1.add(btn3);
        backgroundPanel.add(btn3);

        btn4 = new JButton();
        btn4.setBackground(Color.white);
        btn4.setBounds(800, 550, 400, 50);
        btn4.addActionListener(this);
        backgroundPanel.add(btn4);

        btn5 = new JButton("Start Game!!");
        btn5.setBackground(Color.cyan);
        btn5.setBounds(450, 200, 200, 50);
        btn5.addActionListener(this);
        backgroundPanel.add(btn5);

        btn6 = new JButton("50-50");
        btn6.setBackground(Color.white);
        btn6.setBounds(0, 90, 200, 50);
        btn6.addActionListener(this);
        backgroundPanel.add(btn6);

        btn7 = new JButton("Audience Pole");
        btn7.setBackground(Color.white);
        btn7.setBounds(0, 150, 200, 50);
        btn7.addActionListener(this);
        backgroundPanel.add(btn7);

        btn8 = new JButton("Restart Game");
        btn8.setBackground(Color.cyan);
        btn8.setBounds(700, 200, 200, 50);
        btn8.addActionListener(this);
        backgroundPanel.add(btn8);

        ans = new JLabel();
        ans.setBounds(500, 500, 400, 50);
        ans.setForeground(Color.BLACK);
        ans.setFont(new Font("American Typewriter", Font.PLAIN, 20));
        backgroundPanel.add(ans);

        score = new JLabel();
        score.setBounds(1000, 50, 700, 100);
        score.setForeground(Color.decode("#ffff"));
        score.setFont(new Font("American Typewriter", Font.PLAIN, 20));
        backgroundPanel.add(score);


        setSize(1800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }


    public void actionPerformed(ActionEvent aayushma) {


        if (aayushma.getSource() == btn8) // to restart the game
        {
            data = 0;
            pole = 0;
            five = 0;
            btn6.setText("50-50");
            btn7.setText("Audience Pole");
            score.setText("");
            a = 0;
            b = 0;
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            text2.setText("");
            btn5.setText("Start Game");
        }

        if (aayushma.getSource() == btn7 && pole == 0) //for audience pole
        {
            if (a == 1) {
                message = "A.)36% \n B.)21% \n C.)31% \n D.)12%";
            } else if (a == 2) {
                message = "A.)43% \n B.)2% \n C.)50% \n D.)5%";
            } else if (a == 3) {
                message = "A.)32% \n B.)42% \n C.)21% \n D.)5%";
            } else if (a == 4) {
                message = "A.)12% \n B.)31% \n C.)21% \n D.)36%";
            } else if (a == 5) {
                message = "A.)2% \n B.)50% \n C.)43% \n D.)5%";
            } else if (a == 6) {
                message = "A.)32% \n B.)2% \n C.)21% \n D.)42%";
            } else if (a == 7) {
                message = "A.)25% \n B.)39% \n C.)15% \n D.)21%";
            } else if (a == 8 ){
                message = "A.)15% \n B.)23% \n C.)41% \n D.)21%";
            }
            JOptionPane.showMessageDialog(null, "" + message);

            pole++;
            if (pole == 1) {
                btn7.setText("Used");
            }
        }


        if (aayushma.getSource() == btn6 && five == 0) //for 50-50
        {
            if (a == 1) {

                btn2.setText("");
                btn3.setText("");

            } else if (a == 2) {
                btn1.setText("");
                btn2.setText("");
            } else if (a == 3) {
                btn4.setText("");
                btn1.setText("");
            } else if (a == 4) {
                btn2.setText("");
                btn3.setText("");
            } else if (a == 5) {
                btn1.setText("");
                btn3.setText("");
            } else if (a == 6) {
                btn2.setText("");
                btn3.setText("");
            } else if (a == 7) {
                btn1.setText("");
                btn3.setText("");
            } else if (a == 8) {
                btn2.setText("");
                btn4.setText("");
            }
            five++;
            if (five == 1) {
                btn6.setText("Used");
            }
        }


        if (aayushma.getSource() == btn1)
        {
            if (b == 1) {
                ans.setText("You Are Right!!");
                score.setText("Score:" + a);
                data = 1;
            } else  {
                a = 9;
                b = 9;
                text2.setText("You Loose");
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("You Loose");
                ans.setText("You Loose");
            }
        }
        else if (aayushma.getSource() == btn2)
        {
            if (b == 3) {
                data = 3;
                score.setText("Score:" + a);
                ans.setText("You Are Right!!");
            } else if (b == 5) {
                data = 5;
                score.setText("Score:" + a);
                ans.setText("You Are Right!!");
            } else if (b == 7) {
                data = 7;
                score.setText("Score:" + a);
                ans.setText("You Are Right!!");
            } else {
                a = 9;
                b = 9;
                text2.setText("You Loose");
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("You Loose");
                ans.setText("You Loose");
            }
        }
        else if (aayushma.getSource() == btn3)
        {
            if (b == 2) {
                data = 2;
                score.setText("Score:" + a);
                ans.setText("You Are Right!!");
            } else if (b == 8){
                data = 8;
                score.setText("Score:" + a);
                ans.setText("You Are Right!!");
            }
            else {
                a = 9;
                b = 9;
                text2.setText("You Loose");
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("You Loose");
                ans.setText("You Loose");
            }
        }
        else if (aayushma.getSource() == btn4)
        {
            if (b == 4) {
                data = 4;
                score.setText("Score:" + a);
                ans.setText("You Are Right!!");
            } else if (b == 6) {
                data = 6;
                score.setText("Score:" + a);
                ans.setText("You Are Right!!");
            } else {
                a = 9;
                b = 9;
                text2.setText("You Loose");
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("You Loose");
                ans.setText("You Loose");

            }

        }

        if (aayushma.getSource() == btn5)
        {
            if (a == 0) {
                ans.setText("");
                text2.setText("1. What was used as a processor in 3rd generation computers?");
                btn1.setText("A.)Integrated Circuits");
                btn2.setText("B.)Vacuum Tubes");
                btn3.setText("C.)Transistors");
                btn4.setText("D.)Microprocessors");
                btn5.setText("Next Question");
                a++;
                b++;
            }
            else if (a == 1 && data == 1)
            {
                ans.setText("");
                text2.setText("2. What is the language translator that translates and executes the program at run time line by line?");
                btn1.setText("A.)Assembler");
                btn2.setText("B.)Compiler");
                btn3.setText("C.)Interpreter");
                btn4.setText("D.)Translator");
                a++;
                b++;
            }
            else if (a == 2 && data == 2)
            {
                ans.setText("");
                text2.setText("3. What are the number of values applicable in Boolean Algebra?");
                btn1.setText("A.)3");
                btn2.setText("B.)2");
                btn3.setText("C.)4");
                btn4.setText("D.)1");
                a++;
                b++;
            }
            else if (a == 3 && data == 3)
            {
                text2.setText("4. Who is the father of C programming language?");
                btn1.setText("A.)Tim Berners-Lee");
                btn2.setText("B.)James Gosling");
                btn3.setText("C.)Bjarne Stroustrup");
                btn4.setText("D.)Dennis Ritchie");
                a++;
                b++;
            }
            else if (a == 4 && data == 4)
            {
                ans.setText("");
                text2.setText("5. How many interrupts are there in 8085 microprocessor?");
                btn1.setText("A.)6");
                btn2.setText("B.)5");
                btn3.setText("C.)4");
                btn4.setText("D.)7");
                a++;
                b++;
            }
            else if (a == 5 && data == 5)
            {
                ans.setText("");
                text2.setText("6. Who is the father of Computer Science?");
                btn1.setText("A.)Stephen Hwakings");
                btn2.setText("B.)Thomas Edison");
                btn3.setText("C.)Charles Babbage");
                btn4.setText("D.)Allen Turing");
                a++;
                b++;
            }
            else if (a == 6 && data == 6)
            {
                ans.setText("");
                text2.setText("7. What is the language understood by computer?");
                btn1.setText("A.)C");
                btn2.setText("B.)Binary");
                btn3.setText("C.)Assembly");
                btn4.setText("D.)C++");
                a++;
                b++;
            }
            else if (a == 7 && data == 7)
            {
                text2.setText("8. Which of the following is designed to control the operations of a computer?");
                btn1.setText("A.)Utility Software");
                btn2.setText("B.)Programming Software");
                btn3.setText("C.)System Software");
                btn4.setText("D.)Application Software");
                a++;
                b++;
            }



            else if (a > 7 && data == 8) {
                ans.setText("");
                text2.setText("You Win!");
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                a++;
                b++;
            } else {
                ans.setText("Answer This Question");
            }


        }


    }

    public static void main(String arg[]) {
        new QuizText();
    }

}
