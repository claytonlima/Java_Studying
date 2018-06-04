package java_2;

import org.omg.PortableServer.ThreadPolicyOperations;

public abstract class Conta {
	protected double saldo;
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void deposita(double valor) throws ValorInvalidoException {
		if(valor > 1) {
			this.saldo += valor;
			System.out.println("Deposito de "+saldo+" feito com sucesso");
		}else {
			throw new ValorInvalidoException(valor);
		}
	}
	public boolean saca(Double saque) {
		
		if(this.saldo >= 1) {
			this.saldo -= saque;
			return true;
		}
		
		return false;
	}
	
	public abstract void atualiza(double taxa);
	
}
