package bytebank;

public class Testcontadorgere {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("diego");
		funcionario.setSalario(2000);
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNombre("carlos");
		funcionario2.setSalario(3000);
		
		Gerente gerente = new Gerente();
		gerente.setNombre("jimena");
		gerente.setSalario(5000);
		
	}
}
