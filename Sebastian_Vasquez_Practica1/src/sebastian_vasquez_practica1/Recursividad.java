package sebastian_vasquez_practica1;

import javax.swing.JOptionPane;

public class Recursividad {

    public Recursividad() {
        //clase 2 
    }
    public void Npar(int numBase, int numero) { //Creamos el metodo con los parametros  a usar 
       int x = 20; // Numero hasta el que querramos llegar 

    if (numBase > x) { // Validamos que el "contador" no sobrepase el número solicitado, lo q hace es para q no sea infinito 
        return ; //  hace q se "rompa" el if y podamos avanzar
    }

    if (numBase % 2 == 0) { // Validamos que el numero sea par
        System.out.println(numBase); // Imprimimos el numero
    }

    Npar(numBase + 1, numero); // Llamamos de vuelta la funcion para usarla con el sig numero y que se ejecute todo el proceso de vuelta 
}
    } 
    
    

