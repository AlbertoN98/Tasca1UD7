package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyTest {

    @Test
    void digitsDiferents1() {
        Any any = new Any(2023);
        assertEquals(3,any.digitsDiferents());
    }
    @Test
    void digitsDiferents2() {
        Any any = new Any(226658794);
        assertEquals(7,any.digitsDiferents());
    }
    @Test
    void digitsDiferents3() {
        Any any = new Any(2222);
        assertEquals(1,any.digitsDiferents());
    }
    @Test
    void digitsDiferents4() {
        Any any = new Any(566442238);
        assertEquals(6,any.digitsDiferents());
    }
    @Test
    void digitsDiferents5() {
        Any any = new Any(2030);
        assertEquals(3,any.digitsDiferents());
    }
}