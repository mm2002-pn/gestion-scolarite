package sn.gestionscolarite.classes;

public class Formation {
	private int id;
	private String libelle;
	
	public Formation( String libelle) {
		this.libelle = libelle;
	}
	public Formation(int id, String libelle) {
		this.libelle = libelle;
		this.id=id;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
