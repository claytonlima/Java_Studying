package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.setAgencia(2788);
		primeiraConta.setNumero(10408);

		Cliente primeiroCliente = new Cliente();
		
		// Construtor com paremetros
		
//		Conta segundaConta = new Conta(2469, 696969);
//		System.out.println(segundaConta.getAgencia());
//		System.out.println(segundaConta.getNumero());
		
		primeiroCliente.nome = "Clayton";
		primeiroCliente.cpf = "222.222.222.22";
		primeiroCliente.profissao = "Programador";
		primeiraConta.setTitular(primeiroCliente);
		
		primeiraConta.deposita(200);
		primeiraConta.deposita(100);
		
		System.out.println("Agência: "+primeiraConta.getAgencia());
		System.out.println("Conta: "+primeiraConta.getNumero());
		System.out.println("Cliente: "+primeiraConta.getTitular().getNome());
		System.out.println("CPF: "+primeiraConta.getTitular().getCpf());
		System.out.println("Profissão: "+primeiraConta.getTitular().getProfissao());
		System.out.println("Primeira conta: R$ " + primeiraConta.getSaldo());
		System.out.println("Refeência primeira conta " + primeiraConta);
		System.out.println("Primeira Conta: "+Conta.getTotal());
		
		
		Conta segundaConta = new Conta();
		System.out.println("Segunda Conta: "+Conta.getTotal());
	}
}
