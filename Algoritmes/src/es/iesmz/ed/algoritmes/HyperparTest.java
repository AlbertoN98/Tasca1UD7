package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {

    @Test
    public void test1() {
        Hyperpar hyper = new Hyperpar(266846);
        assertTrue(hyper.esHyperPar());
    }
    @Test
    public void test2() {
        Hyperpar hyper = new Hyperpar(166874);
        assertFalse(hyper.esHyperPar());
    }
    @Test
    public void test3() {
        Hyperpar hyper = new Hyperpar(6822468);
        assertTrue(hyper.esHyperPar());
    }
    @Test
    public void test4() {
        Hyperpar hyper = new Hyperpar(8466482);
        assertTrue(hyper.esHyperPar());
    }
    @Test
    public void test5() {
        Hyperpar hyper = new Hyperpar(1266845);
        assertFalse(hyper.esHyperPar());
    }
    @Test
    public void test6() {
        Hyperpar hyper = new Hyperpar(68448822);
        assertTrue(hyper.esHyperPar());
    }
}