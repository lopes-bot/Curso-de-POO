package aula3;

public class Caneta {
	
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	
	public Caneta(String m, float p, String c) {
		this.setCor(c);
		this.setModelo(m);
		this.tampar();
		this.setPonta(p);
	}
	
	public String getModelo() {
		
		return this.modelo;
	}
	
	public void setModelo(String  m) {
		
		this.modelo = m;
		
	}
	
	public float getPonta() {
		
		return this.ponta;
	}
	
	public void setPonta(float p) {
		
		this.ponta = p ;
	}
	
	public void tampar() {
		
		this.tampada = true;
	}
	
	public void destampar() {
		
		this.tampada = false;
	}
	
	public boolean getTampada() {
		
		
		return this.tampada;
	}
	public void setTampada(boolean b) {
		
		this.tampada = b;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public void status() {
		System.out.println("Sobre a Caneta");
		System.out.println("modelo "+ this.getModelo());
		System.out.println("ponta "+ this.getPonta());
		System.out.println("Cor "+ this.getCor());
		System.out.println("tampada "+ this.getTampada());
	}
	

}
