package JuegoDados;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    @org.junit.jupiter.api.Test
    void setDados() {
        Juego juego = new Juego();
        juego.SetDados();

        assertEquals(2, juego.GetDados().size());
    }

}