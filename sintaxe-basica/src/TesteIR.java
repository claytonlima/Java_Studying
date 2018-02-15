
public class TesteIR {
	public static void main(String[] args) {
		double salario = 2800.01;

		if (salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("Você pode deduzir na declaração o valor de R$ 142");
		}

		if (salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("Pode deduzir R$ 350");
		}

		if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("Pode deduzir R$ 142");
		}
	}
}
