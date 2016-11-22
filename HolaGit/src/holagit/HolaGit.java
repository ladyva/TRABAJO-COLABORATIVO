/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holagit;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class HolaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomb="";
        nomb=JOptionPane.showInputDialog("Dime tu nombre: ");
        JOptionPane.showMessageDialog(null, "Hola "+nomb+" BIENVENIDO A GITHUB");
    }
    
} 
