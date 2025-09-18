package eci.edu.dosw.parcial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EciPaymentTest {
    private EciPayment eciPayment;
    private TiendaVirtual tienda;
    private MetodoDePago metodo;

    @BeforeEach
    void setUp() {
        eciPayment = new EciPayment();
        tienda = new TiendaVirtual();
        metodo = new Efectivo();
        eciPayment.setTienda(tienda);
        eciPayment.setMetodoDePago(metodo);
    }

    @Test
    void testRealizarCompra() {
        assertDoesNotThrow(() -> eciPayment.realizarCompra());
    }

    @Test
    void testGenerarValidaciones() {
        assertDoesNotThrow(() -> eciPayment.generarValidaciones());
    }


   
}
