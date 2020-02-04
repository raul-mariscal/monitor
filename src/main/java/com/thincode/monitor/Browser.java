package com.thincode.monitor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Browser {

    private BufferedReader reader;
    private Integer numLines;

    public Browser() {
        File file = new File("C:\\Users\\mariscalr\\Desktop\\monitor_file.dat_m");
        try{
            this.reader = new BufferedReader(new FileReader(file));            
        }
        catch(Exception e) {
            System.out.println("No se encontro el archivo");
        }
    }

    public int countFileLines() {
       if(this.numLines == null) {
           this.numLines = 0;
           try{
               while(this.reader.readLine() != null)
                this.numLines++;
           }
           catch(IOException e) {
               System.out.println("Error de IO al intentar contar las lineas");
           }
       }
       return this.numLines;
    }

    public String searchForPattern(String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m;
        String dummy;

        System.out.println(p.pattern());

        try {
            while((dummy = this.reader.readLine()) != null) {
                m = p.matcher(dummy);
                if(m.matches()) {
                    return dummy;
                }
            }
        }
        catch(Exception e) {}

        return "";
    }

    public ArrayList<String> searchMessage(String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m;
        String dummy;

        ArrayList<String> message = new ArrayList<>();

        try {
            while((dummy = this.reader.readLine()) != null) {
                m = p.matcher(dummy);
                if(m.matches()) {
                    message.add(dummy);
                    p = Pattern.compile(".{12}I.*");
                    while((dummy = this.reader.readLine()) != null) {
                        m = p.matcher(dummy);
                        if(m.matches() == false)
                            return message;
                        message.add(dummy);
                    }
                }
            }
        }
        catch(Exception e) {}        

        return message;
    }

}