package bytebank;

public class Testfuncionario {

	 public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setDocumento("diego");
		diego.setDocumento("4455222");
		diego.setSalario(3000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getbonificacion());
	}
}
