package com.randombook.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HowManyBook {
    
    public int getHowManyBooks() throws IOException{
        String s;
        Integer howMany = 0;
        try {
            BufferedReader input = new BufferedReader ( new FileReader("howManyBooks.txt") );
             s = input.readLine();
             for( int i = 0  ; i <= 200 ; i++){
                 howMany = i;
                 if( s.matches(howMany.toString()) ) {
                     break;
                 }
             }
             input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HowManyBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        return howMany;
    }
    public void setHowManyBooks (int howMany) throws IOException {
        PrintWriter output = new PrintWriter ( new BufferedWriter( new FileWriter("howManyBooks.txt") ) );
        output.print(howMany);
        output.close();
    }
}
