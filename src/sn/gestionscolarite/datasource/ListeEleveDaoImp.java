package sn.gestionscolarite.datasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import sn.connexionbassedonnes.app.ConnexionBasseDonne;
import sn.gestionexception.app.BadFormatException;
import sn.gestionscolarite.app.ListeDao;
import sn.gestionscolarite.model.Eleve;

public class ListeEleveDaoImp implements ListeDao<Eleve> {

	

	@Override
	public List<Eleve> getList(String classe) throws BadFormatException {
		List<Eleve> eleves = new ArrayList<>();
		try (Connection connection = ConnexionBasseDonne.getConnection()) {
			String query = "Select * From Eleve where classe=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, classe);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int identifiant = rs.getInt("id_eleve");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				LocalDate dateNaiss= LocalDate.parse(rs.getString("date_naiss"));
				char sexe=rs.getString("sexe").charAt(0);
				String formation=rs.getString("formation");
				
				Eleve eleve =  new Eleve(identifiant,nom, prenom, dateNaiss, formation, sexe, classe);
				eleves.add(eleve);	
						
			} 		
		} catch (Exception e) {
			throw new BadFormatException(e.getMessage());
		}
		return eleves;
	}

}
