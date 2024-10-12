
package sebastian_vasquez_practica1;
public class NodoP {
private  dato Dato;
private NodoP siguiente;

    public NodoP() {
        this.siguiente = null;
    }

    public NodoP(dato Dato, NodoP siguiente) {
        this.Dato = Dato;
        this.siguiente = siguiente;
    }

    public NodoP getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }

    public dato getDato() {
        return Dato;
    }

    public void setDato(dato Dato) {
        this.Dato = Dato;
    }
    
}
