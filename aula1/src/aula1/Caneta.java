package aula1;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Esta tampada ? " + this.tampada);
		System.out.println("Espessura da Ponta = " + this.ponta);
		System.out.println("Quantidade de carga = "+ this.carga+"%");
		
	}
	
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Erro nao posso Rabiscar");
			
		}
		else {
			System.out.println("Rabiscando");
		}
		
	}

	void tampar() {
		this.tampada = true;
		
	}
	
	void destampar() {
		this.tampada = false;
		
	}
}
