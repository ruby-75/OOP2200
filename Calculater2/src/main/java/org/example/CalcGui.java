package org.example;

import javax.swing.*;

public class CalcGui {

    private JButton clearBtn;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton multiplyBtn;
    private JButton a0Button;
    private JButton totalBtn;
    private JButton addBtn;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton divideBtn;
    private JTextField aNumTextField;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton SubtractBtn;
    private JPanel panelMain;
    private JButton backSpaceBtn;
    private JButton decimalBtn;
    private JFrame mainFrame;
    String previous, current, operator;


    //create user interface(GUI)
    public CalcGui() {
        mainFrame = new JFrame("Calculator");
        mainFrame.setSize(400, 400);
        mainFrame.setContentPane(panelMain);
        //required to see calculator
        mainFrame.setVisible(true);

        //initalize components
        output =
    }

}
