package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {

    @Test
    void Factorial1() {
        DividirFactorial dividir = new DividirFactorial(5, 3);
        assertEquals(20, dividir.factorial());
    }
    @Test
    void Factorial2() {
        DividirFactorial dividir = new DividirFactorial(10, 6);
        assertEquals(5040, dividir.factorial());
    }
    @Test
    void Factorial3() {
        DividirFactorial dividir = new DividirFactorial(7,4);

        assertEquals(210,dividir.factorial());
    }
    @Test
    void Factorial4() {
        DividirFactorial dividir = new DividirFactorial(8,4);
        assertEquals(1680,dividir.factorial());
    }
    @Test
    void Factorial5() {
        DividirFactorial dividir = new DividirFactorial(9,6);
        assertEquals(504,dividir.factorial());
    }
}