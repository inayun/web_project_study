package probono.service;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Probono;
import probono.model.dto.Activist;
import probono.model.dto.Recipient;
import probono.model.dto.People;





public class NotExistException extends Exception {

	public NotExistException() {}
	public NotExistException(String message) {
		super(message);
	}

}
