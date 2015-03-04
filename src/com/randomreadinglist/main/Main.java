package com.randomreadinglist.main;

import com.randombook.gui.RandomReadGUI;
import com.randombook.model.HowManyBook;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       RandomReadGUI rb = new RandomReadGUI(); 
       rb.setVisible(true);
       HowManyBook hm = new HowManyBook();
       System.out.println("number of books: " + hm.getHowManyBooks() );
    }  
}
