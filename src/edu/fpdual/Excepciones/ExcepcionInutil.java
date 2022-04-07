public class ExcepcionInutil extends Throwable {

	//Atributos
	private final static String MESSAGE = "Exception";
	
	//Constructor
	public ExcepcionInutil(String message) {

		super(MESSAGE +": "+message);

	}

}