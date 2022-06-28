package com.kabaproject.learningjava;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        // GUI intro
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        short age = Short.parseShort(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your " + age);
    }
}
