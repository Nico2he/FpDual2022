public class ExcepcionDos extends ExcepcionUna {

	//Atributos
	private final static String MESSAGE = "Exception";
	
	//Constructor
	public ExcepcionDos(String message) {

		super(MESSAGE +": "+message);

	}

}