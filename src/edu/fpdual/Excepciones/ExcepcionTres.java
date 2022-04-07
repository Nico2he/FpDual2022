public class ExcepcionTres extends ExcepcionDos {

	//Atributos
	private final static String MESSAGE = "Exception";
	
	//Constructor
	public ExcepcionTres(String message) {

		super(MESSAGE +": "+message);

	}

}