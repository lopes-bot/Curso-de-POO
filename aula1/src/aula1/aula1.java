package aula1;

public class aula1 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo ="Bic";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = true;
		c1.carga = 100;
		c1.status();
		c1.tampar();
		c1.rabiscar();
		Caneta c2 = new Caneta();
		c2.modelo = "Bic";
		c2.cor = "vermelho";
		c2.ponta = 0.5f;
		c2.tampada = true;
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
	}

}
