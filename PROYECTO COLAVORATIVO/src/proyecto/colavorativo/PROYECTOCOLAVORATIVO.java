/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.colavorativo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PROYECTOCOLAVORATIVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        sumar o1= new sumar(a, b);
        o1.sumar();
        MULTIPLICAR o2=new MULTIPLICAR(a, b);
        o2.multi();
    }
    
}
