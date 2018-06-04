
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("22465518-1");
		nico.setSalario(2600.00);
		
		System.out.println("Nome: " + nico.getNome());
		System.out.println("Bonificação: " + nico.getBonificacao());
		
	}

}
