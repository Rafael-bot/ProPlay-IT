package ProPlay.Clases.PagPrincipal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.io.FileReader;
import java.io.IOException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import ProPlay.Clases.LoginRegister.Login;
import ProPlay.Clases.MetodosFicheros.MetodoFichero;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana_pagina_principal extends JFrame {

	private JPanel contentPane;
	public JLabel lblUser;
	private ImageIcon icon;
	private Image image;
	private Image modifiImage;
	private JLabel lblLogo;
	private MetodoFichero fich = new MetodoFichero();

	/**
	 * Create the frame.
	 */
	
	public Ventana_pagina_principal() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana_pagina_principal.class.getResource("/ProPlay/Img/logo_size.jpg")));
		setTitle("ProPlay IT - Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 1088, 732);
		
		contentPane = new JPanel();
		contentPane.setDoubleBuffered(false);
		contentPane.setFocusable(false);
		contentPane.setFocusTraversalKeysEnabled(false);
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUser = new JLabel("");
		lblUser.setOpaque(true);
		lblUser.setBackground(new Color(169, 169, 169));
		lblUser.setForeground(Color.WHITE);
		lblUser.setBorder(null);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUser.setBounds(842, 22, 170, 53);
		contentPane.add(lblUser);
		
		JButton buttonOptions = new JButton("");
		buttonOptions.setBackground(new Color(128, 128, 128));
		buttonOptions.setBorder(null);
		buttonOptions.setDefaultCapable(false);
		buttonOptions.setFocusTraversalKeysEnabled(false);
		buttonOptions.setFocusPainted(false);
		buttonOptions.setBounds(1011, 22, 51, 53);
		contentPane.add(buttonOptions);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(169, 169, 169));
		panelMenu.setBounds(842, 115, 220, 544);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JButton btnLibrary = new JButton("Libreria");
		btnLibrary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLibrary.setForeground(new Color(255, 255, 255));
		btnLibrary.setBackground(new Color(128, 128, 128));
		btnLibrary.setBorder(null);
		btnLibrary.setFocusable(false);
		btnLibrary.setFocusTraversalKeysEnabled(false);
		btnLibrary.setFocusPainted(false);
		btnLibrary.setBounds(10, 11, 200, 42);
		panelMenu.add(btnLibrary);
		
		JButton btnShop = new JButton("Tienda");
		btnShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnShop.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnShop.setBackground(new Color(128, 128, 128));
		btnShop.setForeground(new Color(255, 255, 255));
		btnShop.setBorder(null);
		btnShop.setFocusPainted(false);
		btnShop.setFocusTraversalKeysEnabled(false);
		btnShop.setFocusable(false);
		btnShop.setBounds(10, 83, 200, 42);
		panelMenu.add(btnShop);
		
		JButton btnFriends = new JButton("Amigos");
		btnFriends.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFriends.setForeground(new Color(255, 255, 255));
		btnFriends.setBackground(new Color(128, 128, 128));
		btnFriends.setBorder(null);
		btnFriends.setFocusTraversalKeysEnabled(false);
		btnFriends.setFocusPainted(false);
		btnFriends.setFocusable(false);
		btnFriends.setBounds(10, 159, 200, 42);
		panelMenu.add(btnFriends);
		
		JButton btnAtencionClient = new JButton("Atenci\u00F3n Client");
		btnAtencionClient.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtencionClient.setForeground(new Color(255, 255, 255));
		btnAtencionClient.setBackground(new Color(128, 128, 128));
		btnAtencionClient.setBorder(null);
		btnAtencionClient.setFocusPainted(false);
		btnAtencionClient.setFocusTraversalKeysEnabled(false);
		btnAtencionClient.setFocusable(false);
		btnAtencionClient.setBounds(10, 491, 200, 42);
		panelMenu.add(btnAtencionClient);
		
		JPanel panelNovedades = new JPanel();
		panelNovedades.setBackground(new Color(169, 169, 169));
		panelNovedades.setBounds(191, 22, 641, 596);
		contentPane.add(panelNovedades);
		panelNovedades.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(10, 52, 414, 152);
		textPane.setText("");
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(10, 64, 621, 522);
		scrollPane.add(textPane);
		panelNovedades.add(scrollPane);
		
		JLabel lblTitle = new JLabel("Novedades");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setBounds(288, 11, 95, 29);
		panelNovedades.add(lblTitle);
		
		JLabel lblNewLabel = new JLabel("By Rafael Oliva Ramirez");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(449, 629, 139, 30);
		contentPane.add(lblNewLabel);
		
		JLabel labelLogo = new JLabel("");
		icon = new ImageIcon(Login.class.getResource("/ProPlay/Img/logo_size_invert.jpg"));
		image = icon.getImage();
		modifiImage = image.getScaledInstance(180,100, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(modifiImage);
		labelLogo.setIcon(icon);
		labelLogo.setBounds(10, 22, 170, 71);
		contentPane.add(labelLogo);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Login l = new Login();
				
				fich.vaciarRecordar();
				
				l.setVisible(true);
				dispose();				
				
			}
		});
		lblLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLogout.setForeground(Color.WHITE);
		lblLogout.setBounds(918, 74, 51, 20);
		contentPane.add(lblLogout);
		
		
	}
}
