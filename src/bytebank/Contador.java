package bytebank;

public class Contador extends Funcionario{

	
	private String clave;
	
	public void setclave(String clave) {
		this.clave=clave;
		
	}
	
	public boolean iniciarsesion(String clave) {	
		
		return clave=="ingresar";
	}
	
	public double getbonificacion() {
		System.out.println("ejecutando desde contador");
		return super.getSalario();
	}
}
