package bytebank;

public class Testcontrolbono {

	
	public static void main(String[] args) {
		
		Funcionario diego = new Funcionario();
		
		diego.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(5000);
		
		Funcionario carlos = new Contador();
		carlos.setSalario(3000);
		
	   Controlbonificacion controlbonitos = new Controlbonificacion();
	   
	   controlbonitos.registrarSalario(diego);
	   controlbonitos.registrarSalario(carlos);
	   
	   controlbonitos.registrarSalario(jimena); 
	   
	   
	  
	}
	
	
}
