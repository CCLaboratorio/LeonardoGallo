package math;

/**
 * Representa una matriz genérica de elementos numéricos.
 *
 * @param <T> Tipo de dato numérico almacenado en la matriz.
 */
public abstract class Matriz<T> {

    /** Número de filas de la matriz. */
    private int filas;

    /** Número de columnas de la matriz. */
    private int columnas;

    /** Estructura que almacena los elementos de la matriz. */
    // Depende de la implementación;

    /**
     * Construye una matriz con las dimensiones especificadas.
     *
     * @param filas Número de filas.
     * @param columnas Número de columnas.
     */
    public Matriz(int filas, int columnas) {
        // Implementación
    }

    /**
     * Obtiene el número de filas.
     *
     * @return Número de filas.
     */
    public int getFilas();

    /**
     * Obtiene el número de columnas.
     *
     * @return Número de columnas.
     */
    public int getColumnas();

    /**
     * Obtiene el elemento ubicado en una posición.
     *
     * @param fila Índice de la fila.
     * @param columna Índice de la columna.
     * @return Elemento solicitado.
     */
    public T getElemento(int fila, int columna);

    /**
     * Modifica el elemento ubicado en una posición.
     *
     * @param fila Índice de la fila.
     * @param columna Índice de la columna.
     * @param valor Nuevo valor.
     */
    public void setElemento(int fila, int columna, T valor);

    /**
     * Suma dos matrices.
     *
     * @param matrizB Matriz que se sumará.
     * @return Matriz resultante.
     */
    public abstract Matriz<T> sumar(Matriz<T> matrizB);

    /**
     * Resta dos matrices.
     *
     * @param matrizB Matriz que se restará.
     * @return Matriz resultante.
     */
    public abstract Matriz<T> restar(Matriz<T> matrizB);

    /**
     * Multiplica dos matrices.
     *
     * @param matrizB Matriz por la que se multiplicará.
     * @return Matriz resultante.
     */
    public abstract Matriz<T> multiplicar(Matriz<T> matrizB);

    /**
     * Multiplica todos los elementos por un escalar.
     *
     * @param escalar Valor por el que se multiplicará.
     * @return Matriz resultante.
     */
    public abstract Matriz<T> multiplicarPorEscalar(T escalar);

    /**
     * Determina si dos matrices son iguales.
     *
     * @param otra Matriz que se comparará.
     * @return true si son iguales; false en caso contrario.
     */
    public abstract boolean esIgual(Matriz<T> otra);

    /**
     * Genera una representación textual de la matriz.
     *
     * @return Representación en forma de cadena.
     */
    @Override
    public abstract String toString();
}



