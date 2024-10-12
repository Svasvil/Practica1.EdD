package sebastian_vasquez_practica1;
public class Pila {
     private NodoP cima;

    public Pila() {
        this.cima = null;
    }

    public void apilarUnNodo(NodoP nodo1) {
        //ccaso cuando cima es nulla
        if (cima == null) {
            this.cima = nodo1; // definimos el primer objeto 
        } else {
            //nodo1.setSiguiente(cima); // actualizamos cual es el anterior (el que fue la cima) , con esta linea lo que pasa esq 
            this.cima = nodo1; // terminamos de actualizar la nueva cima con el valor nuevo  
            //el this funciona para que sea si o s si el dato que pusimos arriba 
        }
    }

    public void desapilarUnNodo(NodoP nodo1) {
        //validamos que haya un primer elemento 
        if (cima != null) {
            // 1 .Extraer cima actual 
            // 2 . Definir la nueva cima 
            // 3. actia;izar el siguiente del elemento extraido a null

            NodoP elementoExtraido = this.cima;
            //denifimos el anterior a la cima actual como la nueva cima 
            this.cima = this.cima.getSiguiente();

            //Eliminamos la referencia del objeto que ya no esta en la pila 
            elementoExtraido.setSiguiente(null);
        }
    }

    public void imprimirPila() {
        String texto = "";
        if (this.cima != null) {
            // para imprimir , copiamos la cima a una variable auxiliar y sobre esta copia lo recorremos
            NodoP aux = this.cima;
            while (aux != null) {
                texto += aux.getDato().getLetraPalabra()+ "\n";
                //obtenemos el siguiente nodo y actualozamos aux para la siguiente ;inea 
                aux = aux.getSiguiente();
            }

        }
        System.out.println(texto);

    }
    
}
