package JuegoDados;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    void getValor() {
        Dado dado = new Dado(5);
        assertEquals(5, dado.GetValor());

        Dado dado1 = new Dado(2);
        assertEquals(2, dado1.GetValor());
    }

}
