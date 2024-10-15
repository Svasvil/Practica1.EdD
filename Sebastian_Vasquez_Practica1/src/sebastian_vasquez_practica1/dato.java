package sebastian_vasquez_practica1;

public class dato { // Nombre de clase con mayúscula inicial (convención)

    private String letraPalabra;

    // Constructor vacío o que inicializa con una cadena vacía
    public dato() {
        this.letraPalabra = "";
    }

    // Constructor que recibe un parámetro y lo asigna al atributo
    public dato(String letraPalabra) {
        this.letraPalabra = letraPalabra;

    // Métodos getter y setter
    public String getLetraPalabra() {
        return letraPalabra;
    }

    public void setLetraPalabra(String letraPalabra) {
        this.letraPalabra = letraPalabra;
    }
}
