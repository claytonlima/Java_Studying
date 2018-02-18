package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();

		Cliente primeiroCliente = new Cliente();
		primeiroCliente.nome = "Clayton";
		primeiroCliente.cpf = "222.222.222.22";
		primeiroCliente.profissao = "Programador";
		primeiraConta.titular = primeiroCliente;
		
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;
		
		System.out.println("Cliente: "+primeiraConta.titular.nome);
		System.out.println("CPF: "+primeiraConta.titular.cpf);
		System.out.println("Profissão: "+primeiraConta.titular.profissao);
		System.out.println("Saldo: "+primeiraConta.saldo);
		System.out.println("Primeira conta: R$ " + primeiraConta.saldo);
		System.out.println("Refeência primeira conta " + primeiraConta);
	}
}
