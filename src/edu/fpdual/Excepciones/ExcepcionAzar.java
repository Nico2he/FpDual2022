public class ExcepcionAzar extends Throwable {

	//Atributos
	private final static String MESSAGE = "Exception";
	
	//Constructor
	public ExcepcionAzar(String message) {

		super(MESSAGE +": "+message);

	}

}