/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dc_client;

import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class DC_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Client c1 = new Client("Ahmed");
        c1.setVisible(true);
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Client c2 = new Client("youssef");
        c2.setVisible(true);
        c2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
