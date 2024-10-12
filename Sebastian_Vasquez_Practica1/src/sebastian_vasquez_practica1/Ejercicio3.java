package sebastian_vasquez_practica1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio3 {

    public void TenerNumeros() {
      
        int arreglo[], nElementos; //Creamos el arreglo 
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros:")); //Pedimos al usario el tamano del arreglo 
        arreglo = new int[nElementos]; //definimos el tamano el arreglo con la cantidad de numeros solicitados 

  
        for (int i = 0; i < nElementos; i++) { //Creamos un for para solicitar los numeros del arreglo 
            String num1 = JOptionPane.showInputDialog("Digite un numero:");
            int n1 = Integer.parseInt(num1); //convertimos el string a int 
            arreglo[i] = n1; // le asignamos los numeros al arreglo 
        }

        for (int i = 0; i < nElementos - 1; i++) {//lo q hace este bucle es recorrer el arreglo viendo campo x campo 
            for (int j = 0; j < nElementos - 1 - i; j++) { //este bucle funciona para comparar si el numero actual es mayor al siguiente y asi poder cambiarlo 
                if (arreglo[j] > arreglo[j + 1]) { //hacemos la comparacion , de forma del metodo burbuja 
                    int aux = arreglo[j]; //guardamos el valor de i por el momento en un auxiliar 
                    arreglo[j] = arreglo[j + 1]; // hacemos la primera partde del  cambio de valores 
                    arreglo[j + 1] = aux; // hacemos la segunda parte del cambio des valores 
                }
            }
        }
        System.out.println("los numeros ordenados asendentemente son:");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
