package bytebank;

public class Gerente extends Funcionario{

	
	 @Override
	public double getbonificacion() {
		// TODO Auto-generated method stub
		 System.out.println("ejecutando desde gerente");
		return super.getbonificacion();
	}
}
