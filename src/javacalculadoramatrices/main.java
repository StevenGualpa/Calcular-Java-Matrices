/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculadoramatrices;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;

/**
 *
 * @author Steven
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JFrame frm=new JFrame();
        //frm.setSize(400, 400);
        //frm.show();
        FormularioDatos Frm=new FormularioDatos();
        Frm.setExtendedState(MAXIMIZED_BOTH);
        Frm.show();
    }
    
}
