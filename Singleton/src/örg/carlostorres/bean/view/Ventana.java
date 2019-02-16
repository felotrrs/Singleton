/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package örg.carlostorres.bean.view;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Felipe
 */
public class Ventana extends JFrame implements KeyListener {
    
    public Ventana() {
        this.setSize(600, 400);
        this.setTitle("Ejemplo de interfaces");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //JOptionPane.showMessageDialog(null, "Code: " + KeyEvent.getKeyText(e.getKeyCode()));
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //JOptionPane.showMessageDialog(null, "Code: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JOptionPane.showMessageDialog(null, "Code: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

}
    

