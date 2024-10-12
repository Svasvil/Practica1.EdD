package sebastian_vasquez_practica1;


public class Sebastian_Vasquez_Practica1 {

public static void main(String[] args) {

        //Ejercicio #1 Recursividad 
        Recursividad recu = new Recursividad();
        recu.Npar(0, 0); //Nos funcionara solamente de parametro  y que no de error 

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Ejercicio #2 Pilas 
        
        Pila palabras = new Pila(); //Creamos el nuevo objeto 

        int i = 0; // variable para controlrar el ciclo 

        while (i < 10) {
            NodoP nodo1 = new NodoP(); //Creamos un objeto 
            NodoP nodo2 = new NodoP();//Creamos un objeto 
            NodoP nodo3 = new NodoP();//Creamos un objeto 
            NodoP nodo4 = new NodoP();//Creamos un objeto 

            char letra1 = ('H'); // Le definimos a cada char una letra en este caso la H 
            char letra2 = ('o');// Le definimos a cada char una letra en este caso la O 
            char letra3 = ('l');// Le definimos a cada char una letra en este caso la L
            char letra4 = ('a');// Le definimos a cada char una letra en este caso la A

            nodo1.setDato(new dato("La  palabra  es " + letra1)); //Lo que hacemos es meter un setear un dato nuevo con la letra
            nodo2.setDato(new dato("La palabra es " + letra1 + letra2));//Se hace la "suma " de las letras 
            nodo3.setDato(new dato("La palabra es " + letra1 + letra2 + letra3));//Se hace la "suma " de las letras 
            nodo4.setDato(new dato("La palabra es " + letra1 + letra2 + letra3 + letra4));//Se hace la "suma " de las letras 
            //nodo1.setDato(new dato ("La letra es "+i));
 
            palabras.apilarUnNodo(nodo1); //Agreamos el nodo creado al metodo de apilar 
            palabras.apilarUnNodo(nodo2);//Agreamos el nodo creado al metodo de apilar 
            palabras.apilarUnNodo(nodo3);//Agreamos el nodo creado al metodo de apilar 
            palabras.apilarUnNodo(nodo4);//Agreamos el nodo creado al metodo de apilar 

            i++; // lo que hacemos es aumentar la variable al sig numero 
        }
        palabras.imprimirPila(); //Llamamos al metodo de imprimir pila 
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Ejercicio #3 Colas 
        Ejercicio3 Prueba1 = new Ejercicio3(); //Creamos el objerto de la clase 
        Prueba1.TenerNumeros();//llamamos al metodo con el obsjeto creado 

    
        

    }
}
