package es.iesmz.ed.algoritmes;
/**
 * Esta clase compara los numeros y si son todos los numeros introducidos pares para saber si son hyperPares
 * y si hay algún número impar no son hyperPares
 * @author: Alberto Nieto
 * @version: 22/05/2023
 */


public class Hyperpar {
    private long numero;
    /**
     * Constructor para el número hyperPar
     * @param numero El parámetro define un número que se va a comprobar.
     */

    public Hyperpar(long numero) {
        this.numero = numero;
    }

    /**
     * Método que compara si es par o impar
     * @return true o false dependiendo si es par o impar. Par (true), impar (false)
     */
    public boolean esHyperPar() {
        String num = String.valueOf(numero);
        int contadorPar = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) % 2 == 0) {
                contadorPar++;
            } else {
                return false;
            }
        }
        return contadorPar > 0;
    }
}

