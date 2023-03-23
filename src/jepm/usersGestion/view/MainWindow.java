package jepm.usersGestion.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jepm.usersGestion.controllers.ControllerAcuerdo;
import jepm.usersGestion.controllers.ControllerUsers;
import jepm.usersGestion.controllers.CountryController;
import jepm.usersGestion.controllers.LanguageController;
import jepm.usersGestion.model.Country;
import jepm.usersGestion.model.Language;
import jepm.usersGestion.model.User;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField jtfEmail;
	private JTextField jtfUser;
	private JPasswordField jpfPassword;
	private JPasswordField jpfRePassword;
	private JCheckBox checkBox;
	private JComboBox jcLanguage;
	private JComboBox jcCountry; 
	private JButton saveButton;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public MainWindow() throws ClassNotFoundException, SQLException {
		setTitle("Alta de usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0};
//		gbl_contentPane.columnWidths = new int[]{0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Email:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 0;
		contentPane.add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 1;
		contentPane.add(lblUsuario, gbc_lblUsuario);
		
		jtfUser = new JTextField();
		jtfUser.setColumns(10);
		GridBagConstraints gbc_jtfUser = new GridBagConstraints();
		gbc_jtfUser.insets = new Insets(0, 0, 5, 0);
		gbc_jtfUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUser.gridx = 1;
		gbc_jtfUser.gridy = 1;
		contentPane.add(jtfUser, gbc_jtfUser);
		
		JLabel lblPassword = new JLabel("Password:");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 2;
		contentPane.add(lblPassword, gbc_lblPassword);
		
		jpfPassword = new JPasswordField();
		GridBagConstraints gbc_jpfPassword = new GridBagConstraints();
		gbc_jpfPassword.insets = new Insets(0, 0, 5, 0);
		gbc_jpfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_jpfPassword.gridx = 1;
		gbc_jpfPassword.gridy = 2;
		contentPane.add(jpfPassword, gbc_jpfPassword);
		
		JLabel lblNewLabel_5 = new JLabel("Repeticion password:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 3;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jpfRePassword = new JPasswordField();
		GridBagConstraints gbc_jpfRePassword = new GridBagConstraints();
		gbc_jpfRePassword.insets = new Insets(0, 0, 5, 0);
		gbc_jpfRePassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_jpfRePassword.gridx = 1;
		gbc_jpfRePassword.gridy = 3;
		contentPane.add(jpfRePassword, gbc_jpfRePassword);
		
		JLabel lblUsuario_1 = new JLabel("País:");
		GridBagConstraints gbc_lblUsuario_1 = new GridBagConstraints();
		gbc_lblUsuario_1.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario_1.gridx = 0;
		gbc_lblUsuario_1.gridy = 4;
		contentPane.add(lblUsuario_1, gbc_lblUsuario_1);
		
		jcCountry = new JComboBox();
		jcCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					addValuesToLanguage(jcLanguage);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_jcCountry = new GridBagConstraints();
		gbc_jcCountry.insets = new Insets(0, 0, 5, 0);
		gbc_jcCountry.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcCountry.gridx = 1;
		gbc_jcCountry.gridy = 4;
		contentPane.add(jcCountry, gbc_jcCountry);
	
		addValuesToCountry(jcCountry);
		
		JLabel lblIdioma = new JLabel("Idioma:");
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.anchor = GridBagConstraints.EAST;
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 0;
		gbc_lblIdioma.gridy = 5;
		contentPane.add(lblIdioma, gbc_lblIdioma);
		
		jcLanguage = new JComboBox();
		jcLanguage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int languageId = LanguageController.getLanguageId(jcLanguage.getSelectedItem().toString());
					checkBox.setText(ControllerAcuerdo.getDescription(languageId));
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} 
			}
		});
		GridBagConstraints gbc_jcLanguage = new GridBagConstraints();
		gbc_jcLanguage.insets = new Insets(0, 0, 5, 0);
		gbc_jcLanguage.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcLanguage.gridx = 1;
		gbc_jcLanguage.gridy = 5;
		contentPane.add(jcLanguage, gbc_jcLanguage);
		
		
		addValuesToLanguage(jcLanguage);
		
		checkBox = new JCheckBox(ControllerAcuerdo.getDescription(1));
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox.isSelected()) {
					saveButton.setEnabled(true);
				}
				else {
					saveButton.setEnabled(false);
				}
			}
		});
		GridBagConstraints gbc_aceptCheckBox = new GridBagConstraints();
		gbc_aceptCheckBox.insets = new Insets(0, 0, 5, 0);
		gbc_aceptCheckBox.anchor = GridBagConstraints.WEST;
		gbc_aceptCheckBox.gridwidth = 2;
		gbc_aceptCheckBox.gridx = 0;
		gbc_aceptCheckBox.gridy = 6;
		contentPane.add(checkBox, gbc_aceptCheckBox);
		
		
		saveButton = new JButton("Guardar");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					checkEmail();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		GridBagConstraints gbc_saveButton = new GridBagConstraints();
		gbc_saveButton.anchor = GridBagConstraints.EAST;
		gbc_saveButton.gridx = 1;
		gbc_saveButton.gridy = 7;
		contentPane.add(saveButton, gbc_saveButton);
		
		saveButton.setEnabled(false);
	}
	
	/**
	 * 
	 * @param combo
	 */
	private void addValuesToCountry(JComboBox combo) {
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
		List<Country> values = CountryController.countryFindAll();
		
		for(Country value : values) {
			model.addElement(value.toString());
		}
		
		combo.setModel(model);
		
	}
	
	/**
	 * 
	 * @param combo
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	private void addValuesToLanguage(JComboBox combo) throws ClassNotFoundException, SQLException {
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
		List<Language> values = LanguageController.countryFindAll(CountryController.getCountryId((String) jcCountry.getSelectedItem()));
		
		for(Language value : values) {
			model.addElement(value.toString());
		}
		
		combo.setModel(model);
		
	}
	
	/**
	 * 
	 * @param name
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private void insertValues() throws ClassNotFoundException, SQLException {
		User user = new User();
		
		user.setUsuario(jtfUser.getText());
		user.setPassword(jpfPassword.getText());
		user.setEmail(jtfEmail.getText());
		user.setIdIdioma(LanguageController.getLanguageId((String) (jcLanguage.getSelectedItem())));
		
		ControllerUsers.insertUsert(user);
		JOptionPane.showMessageDialog(null, "Inserción realizada correctamente");
	}
	
	/**
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private void checkEmail() throws ClassNotFoundException, SQLException {
		String email = jtfEmail.getText();
		if(email.contains("@") == true && email.contains(".") == true) {
			if (email.indexOf("@") < email.lastIndexOf(".")) {
				checkUsername();
			}
			else {
				JOptionPane.showMessageDialog(null, "El email no es válido");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "El email no es válido");
		}
		
	}
	
	/**
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * 
	 */
	private void checkUsername() throws ClassNotFoundException, SQLException {
		String username = jtfUser.getText();
		
		if(username.length() >= 8) {
			checkPassword();
		}
		else {
			JOptionPane.showMessageDialog(null, "El nombre de usuario debe tener al menos 8 caracteres");
		}
	}
	
	/**
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * 
	 */
	private void checkPassword() throws ClassNotFoundException, SQLException {
		String password = jpfPassword.getText();
		boolean available = false;
		
		boolean hasUppercase = false, hasLowerCase = false, hasDigit = false;
		
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				hasUppercase = true;
			}
			if (Character.isUpperCase(password.charAt(i))) {
				hasLowerCase = true;
			}
			if(Character.isDigit(password.charAt(i))) {
				hasDigit = true;
			}
		}
		
		if (hasLowerCase == true && hasUppercase == true && hasDigit == true) {
			passwordRepeat();
		}
		else {
			JOptionPane.showMessageDialog(null, "Contraseña no rápida");
		}
	}

	/**
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * 
	 */
	private void passwordRepeat() throws ClassNotFoundException, SQLException {
		if (jpfPassword.getText().equals(jpfRePassword.getText())) {
			if (checkExistingName() == true) {
				insertValues();
			}
			else {
				JOptionPane.showMessageDialog(null, "Nombre de usuario existente");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
		}
	}
	
	/**
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * 
	 */
	private boolean checkExistingName() throws ClassNotFoundException, SQLException {
			List <String> existingNames = ControllerUsers.getNameList();
			boolean nameExists = false;
			
			for(String name : existingNames) {
				if(jtfUser.getText().equals(name) == false) {
					nameExists = true;
				}
				else {
					nameExists =  false;
				}
			}
			return nameExists;
	}
	
}
