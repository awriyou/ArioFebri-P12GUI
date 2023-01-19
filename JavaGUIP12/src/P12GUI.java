import javax.swing.*;
import java.awt.*;

public class P12GUI {
    static FlowLayout fl = new FlowLayout();
    static BorderLayout bl = new BorderLayout();
    static GridLayout gl = new GridLayout(2,1);
    static GridLayout gl1 = new GridLayout(3,6);
    static JPanel panel1 = new JPanel();
    static JPanel panel2 = new JPanel();

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("TUGAS P12 Ario Febri Putra Raharjo");
        frame.setSize(600,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JTextField fld = new JTextField("Enter the elements");

        fld.setBounds(0,0,700,50);

        panel1.setLayout(bl);
        panel1.add(fld);


        JButton but1 = new JButton("1");
        JButton but2 = new JButton("2");
        JButton but3 = new JButton("3");
        JButton but4 = new JButton("4");
        JButton but5 = new JButton("5");
        JButton but6 = new JButton("6");

        JButton but7 = new JButton("7");
        JButton but8 = new JButton("8");
        JButton but9 = new JButton("9");
        JButton but10 = new JButton("0");
        JButton but11 = new JButton("+");
        JButton but12 = new JButton("-");

        JButton but13 = new JButton("*");
        JButton but14 = new JButton("/");
        JButton but15 = new JButton("=");
        JButton but16 = new JButton("%");
        JButton but17 = new JButton("Mod");
        JButton but18 = new JButton("Exit");


        panel2.setLayout(gl1);
        frame.setLayout(gl1);
        panel2.add(but1);
        panel2.add(but2);
        panel2.add(but3);
        panel2.add(but4);
        panel2.add(but5);
        panel2.add(but6);

        panel2.add(but7);
        panel2.add(but8);
        panel2.add(but9);
        panel2.add(but10);
        panel2.add(but11);
        panel2.add(but12);

        panel2.add(but13);
        panel2.add(but14);
        panel2.add(but15);
        panel2.add(but16);
        panel2.add(but17);
        panel2.add(but18);

        frame.add(panel1);
        frame.add(panel2);

        frame.setVisible(true);
    }
}
