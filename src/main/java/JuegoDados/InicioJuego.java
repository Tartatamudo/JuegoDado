package JuegoDados;

public class InicioJuego {
    public InicioJuego() {
    }
    public void Jugar(){
        Juego juego = new Juego();
        juego.SetDados();
        juego.ResultadoSuma();
        juego.Resultado();
    }
}
