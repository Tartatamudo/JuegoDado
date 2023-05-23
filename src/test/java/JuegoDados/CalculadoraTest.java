package JuegoDados;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        Calculadora calculadora = new Calculadora(2, 3);
        assertEquals(5, calculadora.sumar());

        Calculadora calculadora1 = new Calculadora(-1, 1);
        assertEquals(0, calculadora1.sumar());

        Calculadora calculadora2 = new Calculadora(20, 0);
        assertEquals(20, calculadora2.sumar());
    }
}