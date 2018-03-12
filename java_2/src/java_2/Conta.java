package java_2;

public class Conta {
	protected double saldo;
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void deposita(double valor) {
		if(valor > 1) {
			this.saldo += valor;
			System.out.println("Deposito de "+saldo+" feito com sucesso");
		}else {
			System.out.println("Deposito não efetuado, valor de "+saldo+" não é permitido, deposite acima 1" );
		}
	}
	
	public boolean saca(Double saque) {
		
		if(this.saldo >= 1) {
			this.saldo -= saque;
			return true;
		}
		
		return false;
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
		
	}
	
	

}
