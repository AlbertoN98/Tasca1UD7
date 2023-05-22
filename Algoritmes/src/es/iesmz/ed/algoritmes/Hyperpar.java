package es.iesmz.ed.algoritmes;

public class Hyperpar {
    private long numero;

    public Hyperpar(long numero) {
        this.numero = numero;
    }

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

