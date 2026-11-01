package math;

/**
 * Representa una matriz cuadrada simétrica.
 *
 * Una matriz es simétrica cuando es igual a su transpuesta.
 *
 * @param <T> Tipo de dato numérico almacenado en la matriz.
 */
public class MatrizSimetrica<T> extends Matriz<T> {

    /**
     * Construye una matriz simétrica de dimensión n x n.
     *
     * @param dimension Número de filas y columnas.
     */
    public MatrizSimetrica(int dimension) {
        // Implementación pendiente
    }

    /**
     * Obtiene el elemento de la posición indicada.
     *
     * @param fila Índice de la fila.
     * @param columna Índice de la columna.
     * @return Elemento solicitado.
     */
    @Override
    public T getElemento(int fila, int columna);

    /**
     * Modifica un elemento conservando la simetría.
     *
     * @param fila Índice de la fila.
     * @param columna Índice de la columna.
     * @param valor Nuevo valor.
     */
    @Override
    public void setElemento(int fila, int columna, T valor);

    // ==============================
    // Operaciones heredadas
    // ==============================

    @Override
    public Matriz<T> sumar(Matriz<T> otra);

    @Override
    public Matriz<T> restar(Matriz<T> otra);

    @Override
    public Matriz<T> multiplicar(Matriz<T> otra);

    @Override
    public Matriz<T> multiplicarPorEscalar(T escalar);

    @Override
    public boolean esIgual(Matriz<T> otra);

    @Override
    public String toString();

    // ==============================
    // Operaciones particulares
    // ==============================

    /**
     * Verifica si la matriz cumple la propiedad de simetría.
     *
     * @return true si es simétrica; false en caso contrario.
     */
    public boolean esSimetrica();

    /**
     * Obtiene la dimensión de la matriz cuadrada.
     *
     * @return Dimensión de la matriz.
     */
    public int getDimension();
}
