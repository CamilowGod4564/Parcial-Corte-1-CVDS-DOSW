package eci.edu.dosw.parcial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TarjetaCreditoTest {
    @Test
    void testValidarMetodoPago() {
        TarjetaCredito credito = new TarjetaCredito();
        assertDoesNotThrow(() -> credito.validarMetodoPago());
    }
    @Test
    void testProcesarPago() {
        TarjetaCredito credito = new TarjetaCredito();
        assertDoesNotThrow(() -> credito.procesarPago());
    }
}
