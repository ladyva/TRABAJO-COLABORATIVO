/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloMultiplicarNumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ModeloMultiplicar {
    int n1,n2;
    
    //Paso 2: Constructor

    public ModeloMultiplicar(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    //Paso 3: Gets y Sets

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    //Paso 4: Defino el metodo
    public void multiplicar(){
        int r=0;
        r=n1*n2;
        JOptionPane.showMessageDialog(null, "La multiplicacion de "+n1+" y "+n2+" es igual a: "+r);
    }
    
}
