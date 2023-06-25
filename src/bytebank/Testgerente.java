package bytebank;

public class Testgerente {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();//polimorfismo puedes hacer referencia a funcionario o gerente pero no al reves 
		
		gerente.setSalario(5200);
		gerente.setTipo(1);
		System.out.println(gerente.getSalario() + " y " + gerente.getbonificacion());
		
	}
}
