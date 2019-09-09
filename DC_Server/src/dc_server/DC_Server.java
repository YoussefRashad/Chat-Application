
package dc_server;

import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class DC_Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        // TODO code application logic here
        Server s = new Server();
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread t = new Thread(s);
        t.start();
    }
    
}
