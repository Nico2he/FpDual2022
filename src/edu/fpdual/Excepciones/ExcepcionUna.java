public class ExcepcionUna extends RuntimeException {

	//Atributos
	private final static String MESSAGE = "Exception";
	
	//Constructor
	public ExcepcionUna(String message) {

		super(MESSAGE +": "+message);

	}

}