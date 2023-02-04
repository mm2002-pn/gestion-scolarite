package sn.scolarite.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import sn.gestionexception.app.BadFormatException;
import sn.gestionexception.app.MissingDataException;
import sn.gestionscolarite.app.AuthentificationDao;
import sn.gestionscolarite.datasource.Authentification;
import sn.gestionscolarite.utilisateur.Utilisateur;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;

public class UIConnexion1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField loginTf;
	private JPasswordField passwordField;
	private AuthentificationDao<Utilisateur> authentification;
	private JEditorPane errorTf;
	public UIConnexion1() {
		getContentPane().setBackground(new Color(0, 0, 0));
		authentification = new Authentification();
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setBackground(new Color(0, 0, 0));
		setResizable(false);
		setSize(new Dimension(627, 460));
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(15,15,15));
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Gestionnaire Scolarite");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\manso\\workspace\\gestion-scolarite-app\\src\\ressource\\n.png"));
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBorder(UIManager.getBorder("Button.border"));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(255, 255, 255));
		panel_4.setBackground(new Color(0, 0, 0));
		panel_3.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 0, 0));
		FlowLayout flowLayout_4 = (FlowLayout) panel_10.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		flowLayout_4.setVgap(0);
		flowLayout_4.setHgap(0);
		panel_4.add(panel_10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel_10.add(lblNewLabel_2);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(0, 0, 0));
		FlowLayout flowLayout_5 = (FlowLayout) panel_9.getLayout();
		flowLayout_5.setHgap(0);
		panel_4.add(panel_9);
		
		errorTf = new JEditorPane();
		errorTf.setForeground(new Color(255, 40, 40));
		errorTf.setEnabled(false);
		errorTf.setBackground(new Color(0, 0, 0));
		errorTf.setPreferredSize(new Dimension(200, 20));
		panel_9.add(errorTf);
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 0, 0));
		panel_7.setForeground(new Color(255, 255, 255));
		panel_7.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Login", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
		FlowLayout flowLayout_1 = (FlowLayout) panel_7.getLayout();
		flowLayout_1.setVgap(20);
		panel_5.add(panel_7);
		
		loginTf = new JTextField();
		loginTf.setForeground(new Color(255, 255, 255));
		loginTf.setBackground(new Color(46, 46, 46));
		loginTf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		loginTf.setPreferredSize(new Dimension(7, 30));
		panel_7.add(loginTf);
		loginTf.setColumns(20);
		
		JPanel panel_8 = new JPanel();
		panel_8.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel_8.setForeground(new Color(0, 0, 0));
		panel_8.setBackground(new Color(0, 0, 0));
		panel_8.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Password", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
		FlowLayout flowLayout_2 = (FlowLayout) panel_8.getLayout();
		flowLayout_2.setVgap(20);
		panel_5.add(panel_8);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBackground(new Color(46, 46, 46));
		passwordField.setPreferredSize(new Dimension(7, 30));
		passwordField.setColumns(20);
		panel_8.add(passwordField);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(null);
		panel_6.setBackground(new Color(0, 0, 0));
		FlowLayout flowLayout_3 = (FlowLayout) panel_6.getLayout();
		flowLayout_3.setVgap(35);
		panel_5.add(panel_6);
		
		JButton btnLogin = new JButton("Submit");
		btnLogin.setBackground(new Color(15, 15, 15));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				validerLoginbd();
				
			}
		});
		btnLogin.setPreferredSize(new Dimension(153, 50));
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_6.add(btnLogin);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.setBackground(new Color(15, 15, 15));
		exitBtn.setForeground(new Color(255, 255, 255));
		exitBtn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		exitBtn.setPreferredSize(new Dimension(136, 50));
		panel_6.add(exitBtn);
	}
	private void reinitProductDetailsForm () {
		this.loginTf.setText(null);
		this.passwordField.setText(null);
	}

	public void showMe() {
		this.setVisible(true);
	}
	public void hideVisible() {
		dispose();
	}
	public void cacherFentre() {
		this.setVisible(false);
	}
	private void validerLoginbd() {
		char [] passwordChar=passwordField.getPassword();
		String password = String.valueOf(passwordChar);
		try {
			authentification.controleFormulaire(loginTf.getText(), password);
			try {
				authentification.authentification(loginTf.getText(), password);
				this.cacherFentre();
			} catch (BadFormatException e) {
				reinitProductDetailsForm();
				errorTf.setText("mot de passe  corresponde pas");
			}
		} catch (MissingDataException | BadFormatException e) {
			    errorTf.setText("Champs vide ou mot de passe faible");
		}
		
		
	}
	
}
