package es.iesmz.ed.algoritmes;
/**
 * Esta clase cuenta saca eñ factorial de los numeros que se introduce en el numerador y denominador
 * @author: Alberto Nieto
 * @version: 22/05/2023
 */
public class DividirFactorial {
    private final int numerador;
    private final int denominador;
    /**
     * Constructor para el numerador y denominador
     * @param numerador,denominador Introduciremos los numeros para sacar el factorial.
     */
    public DividirFactorial(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    /**
     * Método que calcula el factorial del numerador y el denominador
     * @return devuelve el valor resultado de la multiplicacion por el valor de i.
     */
    public double factorial() {
        double resultado = 1;
        for (int i = denominador + 1; i <= numerador; i++) {
            resultado *= i;
        }
        return resultado;
    }

}
