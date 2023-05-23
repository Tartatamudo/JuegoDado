package JuegoDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Juego {

	private ArrayList<Dado> dados = new ArrayList<Dado>();
	private int suma;
	public Juego() {
	}

	public void SetDados() {
		Random random  = new Random();
		for (int i = 0; i < 2 ; i++) {
			int num = (int)(Math.random()*6+1);
			Dado dado = new Dado(num);
			dados.add(dado);
		}
	}

	public void ResultadoSuma() {
		Calculadora calculadora = new Calculadora(dados.get(0).GetValor(), dados.get(1).GetValor());
		suma = calculadora.sumar();
	}

	public void Resultado(){
		if (suma == 7){
			System.out.println("Gano, saco el numero: 7");
		}else{
			System.out.println("Perdio , Saco: " + suma);
		}
	}
	public ArrayList GetDados(){
		return dados;
	}

}