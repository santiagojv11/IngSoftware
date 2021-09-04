/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import views_pkg.FrameRutas;

/**
 *
 * @author santi
 */
public class RutasBicicleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion inst_con = new Conexion();
        FrameRutas inst_frame = new FrameRutas();
        inst_con.getConnection();
        inst_frame.setVisible(true);
    }
    
}
