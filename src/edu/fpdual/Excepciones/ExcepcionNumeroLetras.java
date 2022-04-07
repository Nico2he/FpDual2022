public class ExcepcionNumeroLetras extends Throwable {

	//Atributos
	private final static String MESSAGE = "Exception";
	
	//Constructor
	public ExcepcionNumeroLetras(String message) {

		super(MESSAGE +": "+message);

	}

}