package entidades;

public class Cliente {
	
	private String nome;
	private String agencia;
	private String conta;
	private double saldo;
	private String endereco;
	private char uf;
	
	
	


	public Cliente(String nome, String agencia, String conta, double saldo, String endereco, char uf) {
		super();
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.endereco = endereco;
		this.uf = uf;
	}





	public String getNome() {
		return nome;
	}


	


	public String getAgencia() {
		return agencia;
	}


	


	public String getConta() {
		return conta;
	}


	


	public String getEndereco() {
		return endereco;
	}


	


	public char getUf() {
		return uf;
	}


	public void saque(double valor) {
		
		saldo -= valor;
		
		
	}
	
	
	public void deposito(double valor) {
		
		saldo += valor;
		
		
	}
	
	
	public String imprimeDados() {
		
		
		return "nome: " + nome
				+ "agencia: " + agencia
				+ "conta: " + conta
				+ "saldo: " + saldo;
	}
	
	

}
