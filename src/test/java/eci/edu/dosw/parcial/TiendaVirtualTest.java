package eci.edu.dosw.parcial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TiendaVirtualTest {
    private TiendaVirtual tienda;

    @BeforeEach
    void setUp() {
        tienda = new TiendaVirtual();
    }

    @Test
    void testRealizarCompra() {
        assertDoesNotThrow(() -> tienda.realizarCompra("Producto", "1000", "2", "correo@prueba.com"));
    }

    @Test
    void testGenerarValidadores() {
        assertDoesNotThrow(() -> tienda.generarValidadores());
    }
}
