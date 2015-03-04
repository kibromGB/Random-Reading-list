package com.randombook.controller;

import com.randombook.model.HowManyBook;
import com.randombook.model.RandomBook;
import java.io.IOException;
import java.util.Random;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GenerateController {
    public GenerateController() throws IOException{
     
        RandomBook rb = new RandomBook();
        HowManyBook howMany = new HowManyBook();
        
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        rb = (RandomBook) session.get( RandomBook.class, getRandomNumber(1,howMany.getHowManyBooks() ) );
        try{
            Process process = new ProcessBuilder ("evince" , rb.getLocation()).start();
        }catch(Exception e){
            
        }
    }
    
    public int getRandomNumber(int min , int max){          //generate random number b/n min and max
        Random rd = new Random();
        int i = ( rd.nextInt(max-min +1 ) + min );
        System.out.println("Generated Book id: " + i);
        return i;
    }
    
}
