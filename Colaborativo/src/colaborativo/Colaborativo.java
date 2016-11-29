/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaborativo;

import ModeloMultiplicarNumeros.ModeloMultiplicar;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Colaborativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer numero: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo numero: "));
        
        ModeloMultiplicar ob1=new ModeloMultiplicar(a, b);
        ob1.multiplicar();
    }
    
}
