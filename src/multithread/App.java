/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import javax.swing.JFrame;
import javax.swing.JFileChooser;

/**
 *
 * @author bdf2ch
 */
public class App {
    public static AppFrame frame;
    //public static JFileChooser chooser;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frame = new AppFrame();
        frame.setTitle("Многопоточное приложение");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);
        
    }
    
}
