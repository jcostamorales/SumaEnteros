package index;
/**
 * Comentario para la clase principal 
 * @author Juanvi
 * @version 1.0 12/12/1999
 * @see Logic.java
 * @since 1/1/1999
 */
import logic.Logic;

public class Index {

	/**
	 * Comentario para el metodo  principal main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO metodo main necesita ser implementado
		Logic objSumar = new Logic();
		System.out.println(objSumar.sumar(2, 2));
	}

}
