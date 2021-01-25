package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class AwesomeGUI {

    private static final String sep = System.getProperty("file.separator");
    private static final String newline = System.getProperty("line.separator");
    private static final String dir = System.getProperty("user.home") + sep + "Learning";
    private static final Charset chars = StandardCharsets.UTF_8;

//Убрать из конструктора все локальные гуи объекты, распихать что значит каждая переменная.
    private JFrame jFrame = new JFrame("New Window");
    private JMenu menuFile = new JMenu("File");
    private JMenu menuHelp = new JMenu("Help");
    private JMenuBar jMenuBar = new JMenuBar();
    private JMenuItem menuItemOpen = new JMenuItem("Open");
    private JMenuItem menuItemSave = new JMenuItem("Save");
    private JMenuItem menuItemQuit = new JMenuItem("Quit");
    private  JPanel jPanel = new JPanel();
    private  JLabel jLabel = new JLabel("TextFile");
    private JTextField jTextField = new JTextField(5);
    private JButton send = new JButton("Send");
    private JButton reset = new JButton("Reset");
    private JTextArea jTextArea = new JTextArea();

    private JFileChooser fileChooser = new JFileChooser(dir);

    AwesomeGUI(){
        setLookAndFeel();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,500);

        jMenuBar.add(menuFile);
        jMenuBar.add(menuHelp);

        menuFile.add(menuItemOpen);
        menuFile.add(menuItemSave);
        menuFile.add(menuItemQuit);

        menuItemOpen.addActionListener(new OpenFileListener());
        menuItemQuit.addActionListener(new ExitAppListener());

        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(send);
        jPanel.add(reset);



        jFrame.getContentPane().add(BorderLayout.NORTH, jMenuBar);
        jFrame.getContentPane().add(BorderLayout.CENTER, jTextArea);
        jFrame.getContentPane().add(BorderLayout.SOUTH, jPanel);
        jFrame.setVisible(true);

    }

    private void addingListeners(){
        ActionListener open_file = e -> openingFile();

    }

    private void openingFile() {


    }

    public static void setLookAndFeel(){
        UIManager.put("Button.foreground", Color.CYAN);
        UIManager.put("Label.font", new Font("Dialog",Font.ITALIC, 12));

    }

    public static void main(String[] args) {

    }
}
//18-30 становятся доступными для всего класса