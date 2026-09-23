package util;

/**
 * Clase que implementa 4 métodos distintos para resolver un mismo problema.
 * @author Leonardo Gallo
 */
public class SequenceOfIntegers {

    /**
     * Primer algoritmo para encontrar la suma de la subsecuencia de suma maxima.
     * @param secuencia Es un arreglo que contiene una secuencia de enteros.
     * @return maxSum, regresa la suma máxima
     */
    public int getMaxSum1(int[] sequence) {
        int maxSum = 0;
        int sumAct;

        for (int i = 0; i < sequence.length; i++) {
            for (int j = i; j < sequence.length; j++) {
                sumAct = 0;
                for (int k = i; k <= j; k++) {
                    sumAct += sequence[k];
//                    System.out.println("Suma parcial: " + sumAct);
                }
                if (sumAct > maxSum) {
                    maxSum = sumAct;
                }
            }
        }
        return maxSum;
    }

    /**
     * Segundo algoritmo para encontrar la suma de la subsequence de suma maxima.
     * @param sequence Es un arreglo que contiene una sequence de enteros.
     * @return maxSum, regresa la suma máxima
     */
    public int getMaxSum2(int[] sequence) {
        int maxSum = 0;
        int sumAct;

        for (int i = 0; i < sequence.length; i++) {
            sumAct = 0;
            for (int j = i; j < sequence.length; j++) {
                sumAct += sequence[j];
//                System.out.println("Suma parcial: " + sumAct);
                if (sumAct > maxSum) {
                    maxSum = sumAct;
//                    System.out.println(i + " "+ j);
                }
            }
        }
        return maxSum;
    }

    /**
     * Tercer algoritmo para encontrar la suma de la subsequence de suma maxima.
     * @param sequence Es un arreglo que contiene una sequence de enteros.
     * @return maxSum, regresa la suma máxima
     */
    public int getMaxSum3(int[] sequence) {
        int maxSum = 0;
        int sumAct = 0;

        for (int j = 0; j < sequence.length; j++) {
            sumAct += sequence[j];
            if (sumAct > maxSum) {
                maxSum = sumAct;
//                System.out.println("Suma parcial: " + sumAct);
            } else if (sumAct < 0) {
                sumAct = 0;
            }
        }
        return maxSum;
    }

    /**
     * Cuarto algoritmo para encontrar la suma de la subsequence de suma maxima.
     * @param sequence Es un arreglo que contiene una sequence de enteros.
     * @return maxSum, regresa la suma máxima
     */
    public int getMaxSumRec(int[] sequence) {
        int maxSum = 0;
        int sumAct = 0;
        int sumRec;

        if (sequence.length == 1)
            return sequence[0] > 0? sequence[0]: 0;

        for (int i = 0; i < sequence.length; i++) {
            sumAct += sequence[i];
//            System.out.println("Suma actual en la iteración " + i + " " + sumAct);
            if (sumAct > maxSum && sumAct > 0)
                maxSum = sumAct;
        }

        sumRec = getMaxSumRec(getSubArray(1, sequence));
        
        if (sumRec > maxSum)
            maxSum = sumRec;
//        System.out.println("Suma máxima calculada hasta el momento : " + maxSum);
//        System.out.println("Suma de la llamada recursiva : " + sumRec);
        return maxSum;
    }

    /**
     * Genera un subarreglo de enteros de longitud sequence.length - n
     * @param n
     * @param sequence Es un arreglo que contiene una sequence de enteros.
     * @return
     */
    public int[] getSubArray(int n, int[] sequence) {
        int[] temp;
        if (n < sequence.length)
            temp = new int[sequence.length - n];
        else
            return null;
            
        for (int i = n; i < sequence.length; i++)
            temp[i - n] = sequence[i];
        
        return temp;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {-2, 11, -4, 13, -5, -2};
        // La subsequence de suma maxima es: {11, -4, 13} = 20
        //int a[] = {-1,3,-6};
        int maxSum;
        SequenceDeEnteros sequence = new SequenceDeEnteros();
        
        maxSum = sequence.getMaxSum1(a);        
        System.out.println( "La suma máxima para getMaxSum1 es: " + maxSum );
        
        maxSum = sequence.getMaxSum2(a);
        System.out.println( "La suma máxima para getMaxSum2 es: " + maxSum );
        
        maxSum = sequence.getMaxSum3(a);
        System.out.println( "La suma máxima para getMaxSum3 es: " + maxSum );
        
        maxSum = sequence.getMaxSumRec(a);
        System.out.println( "La suma máxima para getMaxSumRec es: " + maxSum );
    }   
}
