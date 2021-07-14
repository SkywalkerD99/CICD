/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cicd;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author skywa
 */


public class Funny extends JFrame{
    
    public Funny() {
        this.setTitle("Funny!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500, 300);
        this.setContentPane(new Panned());
        this.setVisible(true);
    }
    
    class Panned extends JPanel {
        public void paintComponent(Graphics g){
            try {
                g.setColor(Color.red);
                g.fillRect(0, 0, this.getWidth(), this.getHeight());
                for(int i = 0; i < this.getWidth(); i++){
                    g.setColor(Color.blue);
                    g.fillRect(0, 0, i, this.getHeight());
                    Thread.sleep(20);
                    repaint();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        new Funny();
    }
    
}


