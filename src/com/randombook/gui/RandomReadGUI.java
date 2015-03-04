package com.randombook.gui;

import com.randombook.controller.Handler;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class RandomReadGUI extends JFrame{
    
    private final JButton generate = new JButton("Generate_Book");
    private final JButton add = new JButton("Add_Book");
    private final JButton view = new JButton("Exit");        
    
    public RandomReadGUI(){
        Handler handler = new Handler();
        generate.addActionListener(handler);
        add.addActionListener(handler);
        view.addActionListener(handler);
        
        this.setLayout( new FlowLayout() );
        this.setSize(400,60);
        this.setLocation(500,300);
        this.setDefaultCloseOperation(RandomReadGUI.EXIT_ON_CLOSE);
        this.setTitle("Random Reading List");
        this.setResizable(false);
                
        this.add(generate);
        this.add(add);
        this.add(view);
    }
    
}
