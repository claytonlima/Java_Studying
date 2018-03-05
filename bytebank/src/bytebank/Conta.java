package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public static int total = 0;
	
	public Conta() {
		System.out.println("Criando uma conta");
		Conta.total++;
	}
	
//	public Conta(int agencia, int numero) {
//		this.agencia = agencia;
//		this.numero = numero;
//		this.saldo = 100;
//		System.out.println("estou criando uma conta");
//	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}

		return false;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			destino.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	};
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
