package es.iesmz.ed.algoritmes;
/**
 * Esta clase cuenta los digitos diferentes en el número any.
 * @author: Alberto Nieto
 * @version: 22/05/2023
 */
import java.util.ArrayList;
import java.util.List;


public class Any {

    private final long any;
    /**
     * Constructor para los digitos any
     * @param any El parámetro define un número que se va a contar.
     */
    public Any(long any) {
        this.any = any;
    }
    /**
     * Método que cuenta los numeros.
     * @return los numeros diferentes del numero introducido
     */
    public int digitsDiferents() {
        List<Character> digitsList = new ArrayList<>();
        String anyoStr = String.valueOf(any);

        for (char digitChar : anyoStr.toCharArray()) {
            if (!digitsList.contains(digitChar)) {
                digitsList.add(digitChar);
            }
        }
        return digitsList.size();
    }
}

