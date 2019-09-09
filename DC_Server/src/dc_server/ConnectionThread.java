package dc_server;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class ConnectionThread implements Runnable{
    
    private Socket s;
    private InputStream is;
    private OutputStream os;
    private BufferedReader fromClient;
    private PrintWriter toClient;
    private JLabel Message;

    public ConnectionThread(Socket s , JLabel Msg)throws Exception{
        this.s = s;
        this.Message = Msg;
        is = s.getInputStream();
        os = s.getOutputStream();
    }
    
    @Override
    public void run() {
        fromClient = new BufferedReader(new InputStreamReader(is));
        toClient = new PrintWriter(os,true);
        while(true){
            try{                
                String newMessage = fromClient.readLine();
                Message.setText(Message.getText() + "<br>" + newMessage);
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
