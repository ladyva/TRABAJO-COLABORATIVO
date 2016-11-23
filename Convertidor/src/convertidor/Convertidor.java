/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import Modelo.ModeloConvertidor;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Convertidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String o;
        int a;
        do{
            o=JOptionPane.showInputDialog("Ingrese una opcion: \n1)Convertir de grados Fahrenheit a grados Centigrados. \n2)Convertir de grados Centigrados a grados Fahrenheit. \n3)Salir");
            a=Integer.parseInt(o);
            
        }while(a>=4);
        ModeloConvertidor ob1=new ModeloConvertidor(a);
        ob1.convertir();
        
        
    }
    
}
