package eci.edu.dosw.parcial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EfectivoTest {
    @Test
    void testValidarMetodoPago() {
        Efectivo efectivo = new Efectivo();
        assertDoesNotThrow(() -> efectivo.validarMetodoPago());
    }
    @Test
    void testProcesarPago() {
        Efectivo efectivo = new Efectivo();
        assertDoesNotThrow(() -> efectivo.procesarPago());
    }
}
