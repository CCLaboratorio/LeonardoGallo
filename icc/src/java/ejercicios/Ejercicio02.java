//Doble diagonal para comentario simple

// package

import java.util.Scanner; // es la ubicación de la clase Scanner, para lectura
    
class Ejercicio02 { // Nombre de la clase, empieza en Mayúscula

    /**
     * Comentario de documentación, no lo reconoce javac pero si javadoc
     * Método que busca la JVM para ejecutar un programa.
     */
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String valor;

	System.out.print("Ingresa un valor:");
	valor = sc.nextLine();
	System.out.println("Lo que se guardó en la variable valor es:" + valor);

    }
}
