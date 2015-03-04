package com.randombook.controller;

import com.randombook.controller.AddController;
import com.randombook.controller.GenerateController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Handler implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent event) {
   
        switch( event.getActionCommand() ){
            case "Generate_Book":
                    {
                        try {
                            new GenerateController();
                        } catch (IOException ex) {
                            Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
            case "Add_Book":
                    {
                        try {
                            new AddController();
                        } catch (IOException ex) {
                            Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
            case "Exit":
                    System.exit(1);
                    break;
        }
    }   
}
