/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacurp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static practicacurp.Ventana.btnGenerarCurp;

/**
 *
 * @author Omar
 */
public class Eventos implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(btnGenerarCurp)) {
            new ObtieneCurp().GenerarCurp();
        }
        
    }
    
}
