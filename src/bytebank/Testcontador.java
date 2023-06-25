package bytebank;

public class Testcontador {

		public static void main(String[] args) {
			Contador contador = new Contador();
			contador.setSalario(4500);
			contador.setclave("ingresar");
			
			
			System.out.println(contador.getSalario());
			System.out.println(contador.getbonificacion());
			System.out.println(contador.iniciarsesion("ingresar"));
		}
}
