package com.mycompany.gestordeempleados;

import com.mycompany.gestordeempleados.igu.Principal;
import javax.swing.JFrame;

public class GestorDeEmpleados {

    public static void main(String[] args) {

        Principal ventanaPrinc = new Principal();
        ventanaPrinc.setVisible(true);
        ventanaPrinc.setLocationRelativeTo(null);
        ventanaPrinc.setResizable(false);
        ventanaPrinc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
