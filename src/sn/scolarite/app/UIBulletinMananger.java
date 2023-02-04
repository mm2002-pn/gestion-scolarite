package sn.scolarite.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import sn.gestionexception.app.BadFormatException;
import sn.gestionscolarite.app.Dao;
import sn.gestionscolarite.datasource.ElevesDaoibd;
import sn.gestionscolarite.model.Eleve;
import sn.gestionscolarite.outils.Utilitaires;

public class UIBulletinMananger extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField mathTF;
	private JTextField mathExamenTF;
	private JTextField francaisTF;
	private JTextField francaisExamenFT;
	private JTextField anglaisTF;
	private JTextField anglaisExamenTF;
	private JTextField histoireTF;
	private JTextField histoireExanemTF;
	private Dao<Eleve> listEleve;
	private JPanel nomTf;
	private JPanel classeTf;
	private JLabel classeEtuLabel;
	private JLabel nomEtuLabel;
	private JLabel formationEtuLabel;
	private int id_eleve;
	private JLabel examenLabel;
	private JLabel devoirLabel;
	
	
	public UIBulletinMananger(int id_eleve) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.id_eleve=id_eleve;
		try {
			createInstanceComponents();
			initComponent();
		} catch (BadFormatException e) {
		}
	}

	private void createInstanceComponents() throws BadFormatException {
		listEleve=new ElevesDaoibd();
	}

	public void initComponent() {

		setSize(new Dimension(573, 455));
		setResizable(false);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(15);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_1.setBackground(new Color(255, 255, 255));
		panel.add(panel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UIFenetreChoixSecretaire.class.getResource("/ressource/OIP.jpeg")));
		panel_1.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setHgap(50);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_2);

		JLabel lblNewLabel_1 = new JLabel("Gestionnaire Scolarite");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(46, 46, 46));
		FlowLayout flowLayout_2 = (FlowLayout) panel_28.getLayout();
		flowLayout_2.setVgap(10);
		panel.add(panel_28);
		
		JLabel lblNewLabel_2 = new JLabel("Bulletin de Notes");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel_28.add(lblNewLabel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_14 = (FlowLayout) panel_23.getLayout();
		flowLayout_14.setVgap(15);
		panel_3.add(panel_23);

		JButton ajouteBt = new JButton("Enregistrer");
		ajouteBt.setPreferredSize(new Dimension(150, 30));
		ajouteBt.setBackground(new Color(46, 46, 46));
		ajouteBt.setForeground(new Color(255, 255, 255));
		ajouteBt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		ajouteBt.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_23.add(ajouteBt);

		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_15 = (FlowLayout) panel_24.getLayout();
		flowLayout_15.setVgap(15);
		panel_3.add(panel_24);

		JButton quiiterBtn = new JButton("Quitter");
		quiiterBtn.setPreferredSize(new Dimension(150, 30));
		quiiterBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				onQuitterClick();
			}
		});
		quiiterBtn.setForeground(new Color(255, 255, 255));
		quiiterBtn.setBackground(new Color(46, 46, 46));
		quiiterBtn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_24.add(quiiterBtn);

		JPanel panel_4 = new JPanel();
		getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(6, 3, 0, 0));
		
		nomTf = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) nomTf.getLayout();
		flowLayout_3.setVgap(10);
		panel_4.add(nomTf);
		
		nomEtuLabel = new JLabel("");
		nomEtuLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		nomTf.add(nomEtuLabel);
		
		classeTf = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) classeTf.getLayout();
		flowLayout_4.setVgap(10);
		panel_4.add(classeTf);
		
		classeEtuLabel = new JLabel("");
		classeEtuLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		classeTf.add(classeEtuLabel);
		
		JPanel formationTf = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) formationTf.getLayout();
		flowLayout_5.setVgap(10);
		panel_4.add(formationTf);
		
		formationEtuLabel = new JLabel("");
		formationEtuLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		formationTf.add(formationEtuLabel);
		
		JPanel panel_9 = new JPanel();
		panel_4.add(panel_9);
		
		JLabel lblNewLabel_3 = new JLabel("Libelle");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel_9.add(lblNewLabel_3);
		
		JPanel panel_10 = new JPanel();
		panel_4.add(panel_10);
		
		devoirLabel = new JLabel("Devoir");
		devoirLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel_10.add(devoirLabel);
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5);
		
		examenLabel = new JLabel("Examen");
		examenLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel_5.add(examenLabel);
		
		JPanel panel_11 = new JPanel();
		panel_4.add(panel_11);
		
		JLabel lblNewLabel_4 = new JLabel("Mathématique : ");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_11.add(lblNewLabel_4);
		
		JPanel panel_12 = new JPanel();
		panel_4.add(panel_12);
		
		mathTF = new JTextField();
		panel_12.add(mathTF);
		mathTF.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_4.add(panel_13);
		
		mathExamenTF = new JTextField();
		panel_13.add(mathExamenTF);
		mathExamenTF.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_4.add(panel_14);
		
		JLabel lblNewLabel_5 = new JLabel("Français : ");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_14.add(lblNewLabel_5);
		
		JPanel panel_15 = new JPanel();
		panel_4.add(panel_15);
		
		francaisTF = new JTextField();
		panel_15.add(francaisTF);
		francaisTF.setColumns(10);
		
		JPanel panel_16 = new JPanel();
		panel_4.add(panel_16);
		
		francaisExamenFT = new JTextField();
		panel_16.add(francaisExamenFT);
		francaisExamenFT.setColumns(10);
		
		JPanel panel_17 = new JPanel();
		panel_4.add(panel_17);
		
		JLabel lblNewLabel_6 = new JLabel("Anglais : ");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_17.add(lblNewLabel_6);
		
		JPanel panel_18 = new JPanel();
		panel_4.add(panel_18);
		
		anglaisTF = new JTextField();
		panel_18.add(anglaisTF);
		anglaisTF.setColumns(10);
		
		JPanel panel_19 = new JPanel();
		panel_4.add(panel_19);
		
		anglaisExamenTF = new JTextField();
		panel_19.add(anglaisExamenTF);
		anglaisExamenTF.setColumns(10);
		
		JPanel panel_20 = new JPanel();
		panel_4.add(panel_20);
		
		JLabel lblNewLabel_7 = new JLabel("Histoire Geographie : ");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel_20.add(lblNewLabel_7);
		
		JPanel panel_21 = new JPanel();
		panel_4.add(panel_21);
		
		histoireTF = new JTextField();
		panel_21.add(histoireTF);
		histoireTF.setColumns(10);
		
		JPanel panel_22 = new JPanel();
		panel_4.add(panel_22);
		
		histoireExanemTF = new JTextField();
		panel_22.add(histoireExanemTF);
		histoireExanemTF.setColumns(10);

		Utilitaires.center(this, getSize());
		onAjouteInfoStudent();
	}
	
	private void  onAjouteInfoStudent(){
		try {
		Eleve eleve=listEleve.read(id_eleve);
		if(eleve.getFormation().equals("Elementaire")) {
			examenLabel.setText("");
			devoirLabel.setText("Composition");
			mathExamenTF.setVisible(false);
			francaisExamenFT.setVisible(false);
			histoireExanemTF.setVisible(false);
			anglaisExamenTF.setVisible(false);
		}
		this.nomEtuLabel.setText(eleve.getNom());
		this.formationEtuLabel.setText(eleve.getFormation());
		this.classeEtuLabel.setText(eleve.getClasse());		
		} catch (BadFormatException e) {
			e.printStackTrace();
		}
	}
	private void onQuitterClick() {
		UIListeEleveMananger choix= new UIListeEleveMananger();
		choix.setVisible(true);;
		dispose();
	}
	public void showMe() {
		this.setVisible(true);
	}
	
}
