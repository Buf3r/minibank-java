package bytebank;

public class Controlbonificacion {
	
	private double suma;
	
	public  double registrarSalario(Funcionario funcionario) {
		
		this.suma= funcionario.getbonificacion() + this.suma;
		System.out.println("calculo actual "+this.suma);
		return this.suma;
		
	}
	
	//public  double registrarSalario(Gerente gerente) {
		
	//	//this.suma= gerente.getbonificacion() + this.suma;
		//System.out.println("calculo actual "+this.suma);
		//return this.suma;
		
	//}

}
