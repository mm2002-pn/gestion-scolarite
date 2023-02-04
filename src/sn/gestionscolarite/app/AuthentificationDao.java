package sn.gestionscolarite.app;

import sn.gestionexception.app.BadFormatException;
import sn.gestionexception.app.MissingDataException;

public interface AuthentificationDao <T> {
	
	public void authentification(String login , String password) throws BadFormatException;
	public void controleFormulaire(String login , String password) throws  BadFormatException,MissingDataException;

}
