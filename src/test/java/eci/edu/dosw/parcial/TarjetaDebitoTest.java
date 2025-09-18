package eci.edu.dosw.parcial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TarjetaDebitoTest {
    @Test
    void testValidarMetodoPago() {
        TarjetaDebito debito = new TarjetaDebito();
        assertDoesNotThrow(() -> debito.validarMetodoPago());
    }
    @Test
    void testProcesarPago() {
        TarjetaDebito debito = new TarjetaDebito();
        assertDoesNotThrow(() -> debito.procesarPago());
    }
}
