/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.prueba_polimorf;

/**
 *
 * @author larapresa
 */
public class Prueba_polimorf {

    public static void main(String[] args) {
        // Declaramos un vector de objetos de tipo CLASE A
        claseA[] vector = new claseA[3];
        // Instanciamos los objetos cada uno de una CLASE
        vector[0] = new claseA(); // Instanciamos objeto de CLASE A
        vector[1] = new claseB(); // Instanciamos objeto de CLASE B
        vector[2] = new claseC(); // Instanciamos objeto de CLASE C

        // Comprobamos a qué método imprime cada objeto instanciado
        for (int i = 0; i < 3; i++) {
            System.out.println("Soy el elemento del vector número " + i + ".");
            // vector[0] como hemos instanciado un objeto de la clase A llama a imprime de la CLASE A
            // vector[1] como hemos instanciado un objeto de la clase A llama a imprime de la CLASE B
            // vector[2] como hemos instanciado un objeto de la clase A llama a imprime de la CLASE C
            vector[i].imprime();
        }
    }

}
