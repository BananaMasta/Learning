package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class OpenFileListener implements ActionListener {
    JFrame jFrame = new JFrame();
    JFileChooser jFileChooser = new JFileChooser();


    @Override
    public void actionPerformed(ActionEvent e) {
        jFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        jFileChooser.showOpenDialog(jFrame);
    }
}
