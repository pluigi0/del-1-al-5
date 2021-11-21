
package Condicional1;

import javax.swing.JOptionPane;

/*
Leer numero del 1 al 5
*/
public class Condicional1 {
    public static void main(String[] args) {
        
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("1 mete un numero entre 1 a 5"));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "El numero es 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "El numero es 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "El numero es 3");
                    break;            
            case 4: JOptionPane.showMessageDialog(null, "El numero es 4");
                    break;            
            case 5: JOptionPane.showMessageDialog(null, "El numero es 5");
                    break;
            default: JOptionPane.showMessageDialog(null, "numero fuera de rango");
        
        }
        
        /*
        if (numero > dato){
            JOptionPane.showMessageDialog(null, "Hola que tal "+numero+" es mayor a "+dato);
        }
        else{
            JOptionPane.showMessageDialog(null, "NO lo es");
        }*/   
    }
}
