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
public class ModeloConvertidor {
    public int opcion;
    
    //Paso 2: Constructor

    public ModeloConvertidor(int opcion) {
        this.opcion = opcion;

    }
    
    //Paso 3: Gets y Sets

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }


    
    //Paso 4: Defino el metodo
    public void convertir(){
        String g;
        double cen=0;
        double fahr=0;
        double grados=0;
        switch(opcion){
            case 1:
                g=JOptionPane.showInputDialog("Ingrese los grados Fahrenheit: "); 
                grados=Double.parseDouble(g);
                cen=(grados-32)*5/9;
                JOptionPane.showMessageDialog(null, grados+"°F es igual a: "+cen+"°C");
                break;
            case 2:
                g=JOptionPane.showInputDialog("Ingrese los grados Centigrados: "); 
                grados=Double.parseDouble(g);
                fahr=(grados*9/5)+32;
                JOptionPane.showMessageDialog(null, grados+"°C es igual a: "+fahr+"°F");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro sistema");
                break;
            default:
                JOptionPane.showMessageDialog(null, "La salida es incorrecta");
                break;
        }
       
    }
}
