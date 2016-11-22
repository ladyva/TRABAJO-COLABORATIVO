/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ModeloFactorial {
     
    //Paso 4: Defino el metodo
    public void fac(){
        int r=1;
        for (int i=1;i<=10;i++){
            for (int j=1;j<=i;j++){
                r=r*j;
            }
            JOptionPane.showMessageDialog(null, "El factorial de "+i+" es: "+r);
            r=1;
        }
    }
}
