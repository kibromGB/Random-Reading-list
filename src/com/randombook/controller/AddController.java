package com.randombook.controller;

import com.randombook.gui.RandomReadGUI;
import com.randombook.model.HowManyBook;
import com.randombook.model.RandomBook;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddController {
    
    public AddController() throws IOException{
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter pdfFilter = new FileNameExtensionFilter("pdf files (.pdf)","pdf");
        fc.setFileFilter(pdfFilter);
        fc.setDialogTitle("Select your favourite E-book to add to database");
        int returnValue = fc.showOpenDialog( new RandomReadGUI() );
        if( returnValue == JFileChooser.APPROVE_OPTION ){
            File file = fc.getSelectedFile();
            if( file.isFile() ){
                String name = file.getName();
                String path = file.getPath();
                System.out.println(name);
                System.out.println(path);
                
                RandomBook rb = new RandomBook( name, path );
                HowManyBook howMany = new HowManyBook( );
                
                //to save file detailes to DB using Hibernate
                SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();  //build only once b/c its expensive
                Session session = sessionFactory.openSession();
                session.beginTransaction();
                session.save(rb);
                session.getTransaction().commit();
                session.close();
                howMany.setHowManyBooks( howMany.getHowManyBooks() + 1  );
            }
        }
    }
}
