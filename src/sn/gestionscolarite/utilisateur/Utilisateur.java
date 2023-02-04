package sn.gestionscolarite.utilisateur;

public class Utilisateur {
	protected int id;
	protected String login;
	protected String password ;

	public Utilisateur(int id,String login, String pwd) {
		this(login, pwd);
		this.id = id;
	}

	public Utilisateur(String login, String pwd) {
		this.login = login;
		this.password = pwd;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password= password;
	}

}
