/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author KOLU0897
 */
public class AppThread implements Runnable {
    public File content;
    public Thread thread;
    public JTextArea area;
    
    public AppThread (int number, File f, JTextArea area) {
        this.content = f;
        this.area = area;
        this.thread = new Thread(this, ("thread" + number));               
	thread.start();
        System.out.println("Создан поток #" + number);
    }

    @Override
    public void run() {
        try {
            FileReader reader = new FileReader(this.content);
            int c; 
            String text = "";
            while((c = reader.read()) != -1){                 
                System.out.print((char)c);
                text += (char)c;
            } 
            this.area.setText(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
      
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
