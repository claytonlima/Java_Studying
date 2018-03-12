package java_2;

public class TestaConta {
	public static void main(String[] args) {
			Conta c  = new Conta();
	        Conta cc = new ContaCorrente();
	        Conta cp = new ContaPoupanca();

	        c.deposita(1000); 
	        cc.deposita(1000); 
	        cp.deposita(1000);

	        AtualizadorDeContas a  = new AtualizadorDeContas(0.01);
	        
	        a.roda(c);
	        a.roda(cc);
	        a.roda(cp);
	        
	        System.out.println("Saldo total:" + a.getSaldoTotal());

	}
}
