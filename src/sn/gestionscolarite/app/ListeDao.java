package sn.gestionscolarite.app;

import java.util.List;

import sn.gestionexception.app.BadFormatException;

public interface ListeDao<E> {

	public List<E> getList(String classe) throws  BadFormatException;
}
