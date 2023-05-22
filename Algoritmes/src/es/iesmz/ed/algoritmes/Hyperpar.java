package es.iesmz.ed.algoritmes;

public class Hyperpar {
    private long numero;

    public Hyperpar(long numero) {
        this.numero = numero;
    }

    public boolean esHyperPar(long num){
        boolean esPar = true;
        int contador = 0;
        int noContadorPar = 0;
        int numeros;
        String numero = String.valueOf(num);
        for (int i = 0; i <numero.length() ; i++) {
            if (numero.charAt(i) % 2 == 0) {
                contador++;
            }else {
                noContadorPar ++;
            }
        }
        if (noContadorPar > 0){
            esPar = false;
        }
        return esPar;
    }
}
