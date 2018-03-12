package java_2;

public class ContaPoupanca extends Conta{
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
	
	
	public void deposita(double valor) {
		if(valor > 1) {
			this.saldo += valor - 0.10;
			System.out.println("Deposito de "+saldo+" feito com sucesso");
		}else {
			System.out.println("Deposito não efetuado, valor de "+saldo+" não é permitido, deposite acima 1" );
		}
	}
}
