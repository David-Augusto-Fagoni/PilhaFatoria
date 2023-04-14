package Controller;
import PilhaInt.PilhaI;

public class FatController {
	public long fatorial(int Valor) {
		PilhaI P = new PilhaI();
		for(int J = Valor-1;J > 0;J-- ) {
			P.push(J);
			try {
				Valor = Valor*P.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return Valor;
	}
}