package Packages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class VistaSecretaria extends JFrame {
	
	//Secretaria Inicio
	private JPanel SecrePanel = new JPanel();
	private JLabel reguser = new JLabel("RegUser");
	private JLabel reguser2 = new JLabel("RegUser");
	private JButton botonRegEntra = new JButton("Registro Entrada");
	private JButton botonRegSalida = new JButton("Registro Salida");
	private JButton botonHisEntra = new JButton("Historial Entrada");
	private JButton botonHisSalida = new JButton("Historial Salida");
	private JButton botonHisPago = new JButton("Usuarios");
	private JButton botonNUsuario = new JButton("Nuevo Usuario");
	private JButton botonBUsuario = new JButton("Borrar Usuario");
        private JButton botonClose = new JButton("Cerrar");
        private JButton botonComp = new JButton("Comparar");
	//Registro Entrada
	private JButton RegBoton = new JButton("Registrar");
	private JLabel RegistroTitle = new JLabel("Registro de Entrada");
	private JLabel RegistroTitle2 = new JLabel("Registro de Entrada");
	private JTextField TextID = new JTextField();
	private JTextField TextHora = new JTextField();
	private JLabel labelID = new JLabel("Identificacion");
	private JLabel labelHEntrada = new JLabel("Hora de Entrada");
	private JButton btnRegresarE = new JButton("Regresar");
	private JComboBox BoxTipo = new JComboBox();
	private JLabel lblTipoBox = new JLabel("Tipo");
	//Registro Salida
	private JLabel labelRegSalida = new JLabel("Registro de Salida");
	private JLabel labelRegSalida1 = new JLabel("Registro de Salida");
	private JTextField TextIDSalida = new JTextField();
	private JTextField TextHoraSalida = new JTextField();
	private JLabel labelIDSalida = new JLabel("Identificacion");
	private JLabel labelHSalida = new JLabel("Hora de Salida");
	private JButton RegBotonSalida = new JButton("Registrar");
	private JButton btnRegresarS = new JButton("Regresar");
	private JComboBox BoxTipoS = new JComboBox();
	private JLabel lblTipoBoxS = new JLabel("Tipo");
	
	//Historial Entrada
	private JTable TablaRegistroEntrada = new JTable();
	private JLabel LabelHisEntrada = new JLabel("Historial de Entrada");
	private JLabel LabelHisEntrada2 = new JLabel("Historial de Entrada");
	private JButton btnRegresarEH = new JButton("Regresar");
	private DefaultTableModel modelTableE;
	private JScrollPane SPE = new JScrollPane();
	//Historial Salida
	private JTable TablaRegistroSalida = new JTable();
	private JLabel LabelHisSalida = new JLabel("Historial de Salida");
	private JLabel LabelHisSalida2 = new JLabel("Historial de Salida");
	private JButton btnRegresarSH = new JButton("Regresar");
	private DefaultTableModel modelTableS;
	private JScrollPane SPS = new JScrollPane();
	//Historial Pago
	private JTable TablaRegistroPago = new JTable();
	private JLabel Usuarios = new JLabel("Usuarios");
	private JLabel Usuarios2 = new JLabel("Usuarios");
	private JButton btnRegresarP = new JButton("Regresar");
	private JButton btnRegUsuario = new JButton("Registrar");
	private DefaultTableModel modelTable;
	private JScrollPane SP = new JScrollPane();
	//Nuevo Usuario
	private JLabel RegUserNuevo = new JLabel("RegUser");
	private JLabel RegUserNuevo2 = new JLabel("RegUser");
	private JLabel NuevoUsuario = new JLabel("Nuevo Usuario");
	private JLabel NuevoUsuario2 = new JLabel("Nuevo Usuario");
	private JButton btnRegresarN = new JButton("Regresar");
	private JLabel lblNombre = new JLabel("Nombres");
	private JLabel lblApellido = new JLabel("Apellidos");
	private JTextField Nombre = new JTextField();
	private JTextField Apellidos = new JTextField();
	private JLabel lblEdad = new JLabel("Edad");
	private JTextField Identificacion = new JTextField();
	private JLabel lblIdentificacion = new JLabel("Identificacion");
	private JTextField Edad = new JTextField();
	private JComboBox comboBox = new JComboBox();
	private JLabel lblTipo = new JLabel("Tipo");
	//Borrar Usuario
	private JLabel RegUserBorrar = new JLabel("RegUser");
	private JLabel RegUserBorrar2 = new JLabel("RegUser");
	private JLabel lblBorrar = new JLabel("Borrar Usuario");
	private JLabel lblBorrar2 = new JLabel("Borrar Usuario");
	private JButton btnRegresarB = new JButton("Regresar");
	private JLabel lblinfo = new JLabel("Ingresa la identificacion del Usuario a borrar:");
	private JTextField IdBorrar = new JTextField();
	private JButton btnBorrar = new JButton("Borrar");
	
	
	public VistaSecretaria() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(15, 5, 800, 650);
		setTitle("RegUser | Secretaria");
		SecrePanel.setLayout(null);
		SecrePanel.setBackground(new Color(51, 51, 255));
		SecrePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Botones Ventana Principal Secretaria
		SecrePanel.add(reguser);
		reguser.setForeground(Color.WHITE);
		reguser.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 83));
		reguser.setBounds(234, 12, 351, 97);
		
		SecrePanel.add(reguser2);
		reguser2.setForeground(Color.BLACK);
		reguser2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 85));
		reguser2.setBounds(224, 11, 351, 97);
		
		SecrePanel.add(botonRegEntra);
		botonRegEntra.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonRegEntra.setBounds(104, 131, 186, 40);
		
		SecrePanel.add(botonRegSalida);	
		botonRegSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonRegSalida.setBounds(104, 182, 186, 40);
		
		SecrePanel.add(botonHisEntra);
		botonHisEntra.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonHisEntra.setBounds(300, 131, 186, 40);
		
		SecrePanel.add(botonHisSalida);
		botonHisSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonHisSalida.setBounds(300, 182, 186, 40);
		
		SecrePanel.add(botonHisPago);
		botonHisPago.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonHisPago.setBounds(300, 233, 186, 40);		
		
		botonNUsuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonNUsuario.setBounds(496, 131, 186, 40);
		SecrePanel.add(botonNUsuario);		
		
		botonBUsuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonBUsuario.setBounds(496, 182, 186, 40);
		SecrePanel.add(botonBUsuario);
                
                botonClose.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonClose.setBounds(496, 300, 186, 40);
		SecrePanel.add(botonClose);
                
                botonComp.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonComp.setBounds(496, 400, 186, 40);            
		SecrePanel.add(botonComp);
		
		
		//Botones Ventana Registro Entrada
		SecrePanel.add(RegBoton);		
		RegBoton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		RegBoton.setBounds(488, 313, 177, 34);
		RegBoton.setVisible(false);
		
		SecrePanel.add(RegistroTitle);
		RegistroTitle.setForeground(Color.WHITE);
		RegistroTitle.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 32));
		RegistroTitle.setBounds(244, 120, 351, 97);
		RegistroTitle.setVisible(false);
		
		SecrePanel.add(RegistroTitle2);
		RegistroTitle2.setForeground(Color.BLACK);
		RegistroTitle2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 33));
		RegistroTitle2.setBounds(238, 120, 351, 97);
		RegistroTitle2.setVisible(false);
		
		SecrePanel.add(TextID);
		TextID.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		TextID.setBounds(124, 243, 340, 34);
		TextID.setVisible(false);
			
		SecrePanel.add(TextHora);
		TextHora.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		TextHora.setBounds(125, 313, 340, 34);
		TextHora.setVisible(false);
		
		SecrePanel.add(labelID);
		labelID.setForeground(new Color(0, 0, 0));
		labelID.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		labelID.setBounds(125, 218, 130, 14);
		labelID.setVisible(false);		
		
		SecrePanel.add(labelHEntrada);
		labelHEntrada.setForeground(new Color(0, 0, 0));
		labelHEntrada.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		labelHEntrada.setBounds(126, 288, 159, 14);
		labelHEntrada.setVisible(false);
		
		btnRegresarE.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnRegresarE.setBounds(525, 544, 186, 40);
		btnRegresarE.setVisible(false);
		SecrePanel.add(btnRegresarE);
	
		BoxTipo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		BoxTipo.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		BoxTipo.setBounds(234, 373, 60, 24);
		BoxTipo.setVisible(false);
		SecrePanel.add(BoxTipo);
		
		lblTipoBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblTipoBox.setForeground(Color.BLACK);		
		lblTipoBox.setBounds(179, 374, 60, 22);
		lblTipoBox.setVisible(false);
		SecrePanel.add(lblTipoBox);
		
		
		//Botones Ventana Registro Salida
		
		SecrePanel.add(labelRegSalida);
		labelRegSalida.setForeground(Color.WHITE);
		labelRegSalida.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 32));
		labelRegSalida.setBounds(244, 120, 351, 97);
		labelRegSalida.setVisible(false);
		
		SecrePanel.add(labelRegSalida1);		
		labelRegSalida1.setForeground(Color.BLACK);
		labelRegSalida1.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 33));
		labelRegSalida1.setBounds(238, 120, 351, 97);
		labelRegSalida1.setVisible(false);
		
		SecrePanel.add(TextIDSalida);
		TextIDSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		TextIDSalida.setBounds(124, 243, 340, 34);
		TextIDSalida.setVisible(false);
			
		SecrePanel.add(TextHoraSalida);
		TextHoraSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		TextHoraSalida.setBounds(125, 313, 340, 34);
		TextHoraSalida.setVisible(false);
		
		SecrePanel.add(labelIDSalida);
		labelIDSalida.setForeground(new Color(0, 0, 0));
		labelIDSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		labelIDSalida.setBounds(125, 218, 130, 14);
		labelIDSalida.setVisible(false);		
		
		SecrePanel.add(labelHSalida);
		labelHSalida.setForeground(new Color(0, 0, 0));
		labelHSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		labelHSalida.setBounds(126, 288, 159, 14);
		labelHSalida.setVisible(false);
		
		SecrePanel.add(RegBotonSalida);		
		RegBotonSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		RegBotonSalida.setBounds(488, 313, 177, 34);
		RegBotonSalida.setVisible(false);
		
		btnRegresarS.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnRegresarS.setBounds(525, 544, 186, 40);
		btnRegresarS.setVisible(false);
		SecrePanel.add(btnRegresarS);
		
		BoxTipoS.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		BoxTipoS.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		BoxTipoS.setBounds(234, 373, 60, 24);
		BoxTipoS.setVisible(false);
		SecrePanel.add(BoxTipoS);
		
		lblTipoBoxS.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblTipoBoxS.setForeground(Color.BLACK);		
		lblTipoBoxS.setBounds(179, 374, 60, 22);
		lblTipoBoxS.setVisible(false);
		SecrePanel.add(lblTipoBoxS);
		
		// Historial Entrada
		
		SecrePanel.add(SPE);
		SPE.setBounds(74, 213, 637, 320);
		SPE.setVisible(false);
                
		
		SecrePanel.add(LabelHisEntrada);
		LabelHisEntrada.setForeground(Color.WHITE);
		LabelHisEntrada.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 32));
		LabelHisEntrada.setBounds(244, 120, 351, 97);
		LabelHisEntrada.setVisible(false);
		
		SecrePanel.add(LabelHisEntrada2);
		LabelHisEntrada2.setForeground(Color.BLACK);
		LabelHisEntrada2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 33));
		LabelHisEntrada2.setBounds(238, 120, 351, 97);		
		LabelHisEntrada2.setVisible(false);
		
		btnRegresarEH.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnRegresarEH.setBounds(525, 544, 186, 40);
		btnRegresarEH.setVisible(false);
		SecrePanel.add(btnRegresarEH);
		
		//Historial Salida
		
		SecrePanel.add(SPS);
		SPS.setBounds(74, 213, 637, 320);
		SPS.setVisible(false);
		
		SecrePanel.add(LabelHisSalida);
		LabelHisSalida.setForeground(Color.WHITE);
		LabelHisSalida.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 32));
		LabelHisSalida.setBounds(244, 120, 351, 97);
		LabelHisSalida.setVisible(false);
		
		SecrePanel.add(LabelHisSalida2);
		LabelHisSalida2.setForeground(Color.BLACK);
		LabelHisSalida2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 33));
		LabelHisSalida2.setBounds(238, 120, 351, 97);		
		LabelHisSalida2.setVisible(false);
		
		btnRegresarSH.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnRegresarSH.setBounds(525, 544, 186, 40);
		btnRegresarSH.setVisible(false);
		SecrePanel.add(btnRegresarSH);
		
		//Usuarios
		
		
		SecrePanel.add(SP);
		SP.setBounds(74, 213, 637, 320);
		SP.setVisible(false);
		
		SecrePanel.add(Usuarios);
		Usuarios.setForeground(Color.WHITE);
		Usuarios.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 32));
		Usuarios.setBounds(339, 120, 351, 97);
		Usuarios.setVisible(false);
		
		SecrePanel.add(Usuarios2);
		Usuarios2.setForeground(Color.BLACK);
		Usuarios2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 33));
		Usuarios2.setBounds(339, 120, 351, 97);	
		Usuarios2.setVisible(false);
		
		btnRegresarP.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnRegresarP.setBounds(525, 544, 186, 40);
		btnRegresarP.setVisible(false);
		SecrePanel.add(btnRegresarP);
		
		
		//Nuevo Usuario		
		
		RegUserNuevo.setForeground(Color.WHITE);
		RegUserNuevo.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 83));
		RegUserNuevo.setBounds(234, 12, 351, 97);
		RegUserNuevo.setVisible(false);
		SecrePanel.add(RegUserNuevo);		
		
		RegUserNuevo2.setForeground(Color.BLACK);
		RegUserNuevo2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 85));
		RegUserNuevo2.setBounds(224, 11, 351, 97);
		RegUserNuevo2.setVisible(false);
		SecrePanel.add(RegUserNuevo2);		
		
		NuevoUsuario.setForeground(Color.WHITE);
		NuevoUsuario.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 32));
		NuevoUsuario.setBounds(299, 120, 351, 97);
		NuevoUsuario.setVisible(false);
		SecrePanel.add(NuevoUsuario);		
		
		NuevoUsuario2.setForeground(Color.BLACK);
		NuevoUsuario2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 33));
		NuevoUsuario2.setBounds(293, 120, 351, 97);
		NuevoUsuario2.setVisible(false);
		SecrePanel.add(NuevoUsuario2);		
		
		btnRegresarN.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnRegresarN.setBounds(525, 544, 186, 40);
		btnRegresarN.setVisible(false);
		SecrePanel.add(btnRegresarN);		
		
		lblNombre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setBounds(140, 218, 83, 14);
		lblNombre.setVisible(false);
		SecrePanel.add(lblNombre);
				
		lblApellido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblApellido.setForeground(Color.BLACK);
		lblApellido.setBounds(140, 276, 102, 20);
		lblApellido.setVisible(false);
		SecrePanel.add(lblApellido);		
		
		Nombre.setBounds(140, 243, 193, 20);
		Nombre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		SecrePanel.add(Nombre);
		Nombre.setVisible(false);
		Nombre.setColumns(10);		
		
		Apellidos.setColumns(10);
		Apellidos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		Apellidos.setBounds(140, 304, 193, 20);
		Apellidos.setVisible(false);
		SecrePanel.add(Apellidos);		
		
		lblIdentificacion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblIdentificacion.setForeground(Color.BLACK);
		lblIdentificacion.setBounds(140, 344, 132, 14);
		lblIdentificacion.setVisible(false);
		SecrePanel.add(lblIdentificacion);
				
		Identificacion.setColumns(10);
		Identificacion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		Identificacion.setBounds(140, 369, 193, 20);
		Identificacion.setVisible(false);
		SecrePanel.add(Identificacion);
				
		lblEdad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblEdad.setForeground(Color.BLACK);
		lblEdad.setBounds(405, 218, 83, 14);
		lblEdad.setVisible(false);
		SecrePanel.add(lblEdad);
				
		Edad.setColumns(10);
		Edad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		Edad.setBounds(405, 243, 193, 20);
		Edad.setVisible(false);
		SecrePanel.add(Edad);		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(405, 304, 56, 20);
		comboBox.setVisible(false);
		SecrePanel.add(comboBox);		
		
		lblTipo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblTipo.setForeground(Color.BLACK);
		lblTipo.setBounds(405, 276, 93, 20);
		lblTipo.setVisible(false);
		SecrePanel.add(lblTipo);
		
		btnRegUsuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnRegUsuario.setBounds(323, 544, 186, 40);
		btnRegUsuario.setVisible(false);
		SecrePanel.add(btnRegUsuario);
		
		//BorrarUsuario		
		
		RegUserBorrar.setForeground(Color.WHITE);
		RegUserBorrar.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 83));
		RegUserBorrar.setBounds(234, 12, 351, 97);
		RegUserBorrar.setVisible(false);
		SecrePanel.add(RegUserBorrar);
		
		RegUserBorrar2.setForeground(Color.BLACK);
		RegUserBorrar2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 85));
		RegUserBorrar2.setBounds(224, 11, 351, 97);
		RegUserBorrar2.setVisible(false);
		SecrePanel.add(RegUserBorrar2);
				
		lblBorrar.setForeground(Color.WHITE);
		lblBorrar.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 32));
		lblBorrar.setBounds(299, 120, 351, 97);
		lblBorrar.setVisible(false);
		SecrePanel.add(lblBorrar);
				
		lblBorrar2.setForeground(Color.BLACK);
		lblBorrar2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 33));
		lblBorrar2.setBounds(293, 120, 351, 97);
		lblBorrar2.setVisible(false);
		SecrePanel.add(lblBorrar2);
				
		btnRegresarB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnRegresarB.setBounds(525, 544, 186, 40);
		btnRegresarB.setVisible(false);
		SecrePanel.add(btnRegresarB);
		
		
		lblinfo.setForeground(Color.BLACK);
		lblinfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblinfo.setBounds(222, 218, 445, 24);
		lblinfo.setVisible(false);
		SecrePanel.add(lblinfo);
		
		
		IdBorrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		IdBorrar.setBounds(263, 253, 193, 20);
		IdBorrar.setVisible(false);
		SecrePanel.add(IdBorrar);
		IdBorrar.setColumns(10);
		
		
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnBorrar.setBounds(467, 249, 118, 29);
		btnBorrar.setVisible(false);
		SecrePanel.add(btnBorrar);
		
		this.add(SecrePanel);
						
	}
	
	public void TRegEntrada() {
		TablaRegistroEntrada.setVisible(true);
		TablaRegistroEntrada.setModel(new DefaultTableModel(new Object[][]{},new Object[]{"Identificacion","Hora Entrada"}));
	 	SPE.setViewportView(TablaRegistroEntrada);
	 	SPE.setVisible(true);
	 	modelTableE = (DefaultTableModel)TablaRegistroEntrada.getModel();
	 }
	
	public void updateJTEntrada(ArrayList<Object[]> valuesRow) {

	 	for(int i = 0; i < valuesRow.size(); i++) {
	 		modelTableE.addRow(valuesRow.get(i));
	 	}

	 }	
	
	public void TRegPago() {
		TablaRegistroPago.setVisible(true);
	 	TablaRegistroPago.setModel(new DefaultTableModel(new Object[][]{},new Object[]{"Nombre", "Apellido", "Identificacion", "Tipo Empleado"}));
	 	SP.setViewportView(TablaRegistroPago);
	 	SP.setVisible(true);
	 	modelTable = (DefaultTableModel)TablaRegistroPago.getModel();
	 }
	
	public void updateJT(ArrayList<Object[]> valuesRow) {

	 	for(int i = 0; i < valuesRow.size(); i++) {
	 		modelTable.addRow(valuesRow.get(i));
	 	}

	 }
	
	public void TRegSalida() {
		TablaRegistroSalida.setVisible(true);
		TablaRegistroSalida.setModel(new DefaultTableModel(new Object[][]{},new Object[]{"Identificacion", "Hora Salida"}));
	 	SPS.setViewportView(TablaRegistroSalida);
	 	SPS.setVisible(true);
	 	modelTableS = (DefaultTableModel)TablaRegistroSalida.getModel();
	 }
	
	public void updateJTSalida(ArrayList<Object[]> valuesRowSalida) {

	 	for(int i = 0; i < valuesRowSalida.size(); i++) {
	 		modelTableS.addRow(valuesRowSalida.get(i));
	 	}

	 }
	
	public void CambioRegEntra(){
		
		botonRegEntra.setVisible(false);
		botonRegSalida.setVisible(false);
		botonHisEntra.setVisible(false);
		botonHisSalida.setVisible(false);
		botonHisPago.setVisible(false);
		botonNUsuario.setVisible(false);
		botonBUsuario.setVisible(false);
                botonClose.setVisible(false);
		RegBoton.setVisible(true);
		RegistroTitle.setVisible(true);
		RegistroTitle2.setVisible(true);
		TextID.setVisible(true);
		TextHora.setVisible(true);
		labelID.setVisible(true);	
		labelHEntrada.setVisible(true);
		btnRegresarE.setVisible(true);
		BoxTipo.setVisible(true);
		lblTipoBox.setVisible(true);
                botonComp.setVisible(false);
	}
	
	public void CambioRegSalida(){
		
		botonRegEntra.setVisible(false);
		botonRegSalida.setVisible(false);
		botonHisEntra.setVisible(false);
                botonClose.setVisible(false);
		botonHisSalida.setVisible(false);
		botonHisPago.setVisible(false);
                botonComp.setVisible(false);
		botonNUsuario.setVisible(false);
		botonBUsuario.setVisible(false);
		labelRegSalida.setVisible(true);
		labelRegSalida1.setVisible(true);
		TextIDSalida.setVisible(true);
		TextHoraSalida.setVisible(true);
		labelIDSalida.setVisible(true);	
		labelHSalida.setVisible(true);
		RegBotonSalida.setVisible(true);
		btnRegresarS.setVisible(true);
		BoxTipoS.setVisible(true);
		lblTipoBoxS.setVisible(true);
	}
	
	public void CambioHisEntrada(){
			
			botonRegEntra.setVisible(false);
			botonRegSalida.setVisible(false);
			botonHisEntra.setVisible(false);
                        botonClose.setVisible(false);                        
			botonHisSalida.setVisible(false);
			botonHisPago.setVisible(false);
			botonNUsuario.setVisible(false);
                        botonComp.setVisible(false);
			botonBUsuario.setVisible(false);
			TablaRegistroEntrada.setVisible(true);
			LabelHisEntrada.setVisible(true);
			LabelHisEntrada2.setVisible(true);
			btnRegresarEH.setVisible(true);
			SPE.setVisible(true);
		}
	
	public void CambioHisSalida(){
		
		botonRegEntra.setVisible(false);
		botonRegSalida.setVisible(false);
                botonComp.setVisible(false);
		botonHisEntra.setVisible(false);
		botonHisSalida.setVisible(false);
                botonClose.setVisible(false);
		botonHisPago.setVisible(false);
		botonNUsuario.setVisible(false);
		botonBUsuario.setVisible(false);
		TablaRegistroSalida.setVisible(true);
		LabelHisSalida.setVisible(true);
		LabelHisSalida2.setVisible(true);
		btnRegresarSH.setVisible(true);
		SPS.setVisible(true);
		
	}
	public void CambioHisPago(){
			
			botonRegEntra.setVisible(false);
			botonRegSalida.setVisible(false);
			botonHisEntra.setVisible(false);
                        botonClose.setVisible(false);
			botonHisSalida.setVisible(false);
                        botonComp.setVisible(false);
			botonHisPago.setVisible(false);
			botonNUsuario.setVisible(false);
			botonBUsuario.setVisible(false);
			TablaRegistroPago.setVisible(true);
			Usuarios.setVisible(true);
			Usuarios2.setVisible(true);
			btnRegresarP.setVisible(true);
			Usuarios.setVisible(true);
			
		}
	public void CambioNuevo(){
		
		botonRegEntra.setVisible(false);
		botonRegSalida.setVisible(false);
		botonHisEntra.setVisible(false);
		botonHisSalida.setVisible(false);
		botonHisPago.setVisible(false);
		botonNUsuario.setVisible(false);
                botonComp.setVisible(false);
                botonClose.setVisible(false);
		botonBUsuario.setVisible(false);
		RegUserNuevo.setVisible(true);
		RegUserNuevo2.setVisible(true);
		NuevoUsuario.setVisible(true);
		NuevoUsuario2.setVisible(true);
		btnRegresarN.setVisible(true);
		lblNombre.setVisible(true);
		lblApellido.setVisible(true);
		Apellidos.setVisible(true);
		Nombre.setVisible(true);
		Identificacion.setVisible(true);
		lblIdentificacion.setVisible(true);
		Edad.setVisible(true);
		comboBox.setVisible(true);
		lblTipo.setVisible(true);
		lblEdad.setVisible(true);
		btnRegUsuario.setVisible(true);
		
		
	}
	public void CambioBorrar(){
		
		botonRegEntra.setVisible(false);
		botonRegSalida.setVisible(false);
		botonHisEntra.setVisible(false);
		botonHisSalida.setVisible(false);
		botonHisPago.setVisible(false);
                botonClose.setVisible(false);
                botonComp.setVisible(false);
		botonNUsuario.setVisible(false);
		botonBUsuario.setVisible(false);
		RegUserBorrar.setVisible(true);
		RegUserBorrar2.setVisible(true);
		lblBorrar.setVisible(true);
		lblBorrar2.setVisible(true);
		btnRegresarB.setVisible(true);
		lblinfo.setVisible(true);
		IdBorrar.setVisible(true);
		btnBorrar.setVisible(true);
		
		
	}
	
	public void Volver(){
		
		botonRegEntra.setVisible(true);
		botonRegSalida.setVisible(true);
		botonHisEntra.setVisible(true);
		botonHisSalida.setVisible(true);
                botonComp.setVisible(true);
                botonClose.setVisible(true);
		botonHisPago.setVisible(true);
		botonNUsuario.setVisible(true);
		botonBUsuario.setVisible(true);
		RegBoton.setVisible(false);
		RegistroTitle.setVisible(false);
		RegistroTitle2.setVisible(false);
		TextID.setVisible(false);
		TextHora.setVisible(false);
		labelID.setVisible(false);	
		labelHEntrada.setVisible(false);
		labelRegSalida.setVisible(false);
		labelRegSalida1.setVisible(false);
		TextIDSalida.setVisible(false);
		TextHoraSalida.setVisible(false);
		labelIDSalida.setVisible(false);	
		labelHSalida.setVisible(false);
		RegBotonSalida.setVisible(false);
		TablaRegistroEntrada.setVisible(false);
		LabelHisEntrada.setVisible(false);
		LabelHisEntrada2.setVisible(false);
		TablaRegistroSalida.setVisible(false);
		LabelHisSalida.setVisible(false);
		LabelHisSalida2.setVisible(false);
		TablaRegistroPago.setVisible(false);
		Usuarios.setVisible(false);
		Usuarios2.setVisible(false);
		btnRegresarP.setVisible(false);
		btnRegresarE.setVisible(false);
		btnRegresarS.setVisible(false);
		btnRegresarEH.setVisible(false);
		btnRegresarSH.setVisible(false);
		btnRegresarP.setVisible(false);
		RegUserNuevo.setVisible(false);
		RegUserNuevo2.setVisible(false);
		NuevoUsuario.setVisible(false);
		NuevoUsuario2.setVisible(false);
		btnRegresarN.setVisible(false);
		lblNombre.setVisible(false);
		lblApellido.setVisible(false);
		Nombre.setVisible(false);
		lblIdentificacion.setVisible(false);
		Identificacion.setVisible(false);
		lblIdentificacion.setVisible(false);
		Edad.setVisible(false);
		comboBox.setVisible(false);
		lblTipo.setVisible(false);
		Apellidos.setVisible(false);
		lblEdad.setVisible(false);
		RegUserBorrar.setVisible(false);
		RegUserBorrar2.setVisible(false);
		lblBorrar.setVisible(false);
		lblBorrar2.setVisible(false);
		btnRegresarB.setVisible(false);
		lblinfo.setVisible(false);
		IdBorrar.setVisible(false);
		btnBorrar.setVisible(false);
		SP.setVisible(false);
		btnRegresarP.setVisible(false);
		btnRegUsuario.setVisible(false);
		SPS.setVisible(false);
		SPE.setVisible(false);
		BoxTipo.setVisible(false);
		lblTipoBox.setVisible(false);
		BoxTipoS.setVisible(false);
		lblTipoBoxS.setVisible(false);
		
	}

	void botonRegEntra( ActionListener listener )
	{
		this.botonRegEntra.addActionListener(listener);
	}
	void botonRegsalida( ActionListener listener )
	{
		this.botonRegSalida.addActionListener(listener);
	}
	void botonHisEntra( ActionListener listener )
	{
		this.botonHisEntra.addActionListener(listener);
	}
	void botonHisSalida( ActionListener listener )
	{
		this.botonHisSalida.addActionListener(listener);
	}
	void botonHisPago( ActionListener listener )
	{
		this.botonHisPago.addActionListener(listener);
	}
	void botonNUsuario( ActionListener listener )
	{
		this.botonNUsuario.addActionListener(listener);
	}
	void botonBUsuario( ActionListener listener )
	{
		this.botonBUsuario.addActionListener(listener);
	}
	void btnRegresarE( ActionListener listener )
	{
		this.btnRegresarE.addActionListener(listener);
	}
	void btnRegresarS( ActionListener listener )
	{
		this.btnRegresarS.addActionListener(listener);
	}
	void btnRegresarEH( ActionListener listener )
	{
		this.btnRegresarEH.addActionListener(listener);
	}
	void btnRegresarSH( ActionListener listener )
	{
		this.btnRegresarSH.addActionListener(listener);
	}
	void btnRegresarP( ActionListener listener )
	{
		this.btnRegresarP.addActionListener(listener);
	}
	void btnRegresarN( ActionListener listener )
	{
		this.btnRegresarN.addActionListener(listener);
	}
	void btnRegresarB( ActionListener listener )
	{
		this.btnRegresarB.addActionListener(listener);
	}
	void RegBoton( ActionListener listener )
	{
		this.RegBoton.addActionListener(listener);
	}
	void RegBotonSalida( ActionListener listener )
	{
		this.RegBotonSalida.addActionListener(listener);
	}
	void btnRegUsuario( ActionListener listener )
	{
		this.btnRegUsuario.addActionListener(listener);
	}
	void btnBorrar( ActionListener listener )
	{
		this.btnBorrar.addActionListener(listener);
	}
        void botonClose( ActionListener listener )
	{
		this.botonClose.addActionListener(listener);
	}
        void botonComp( ActionListener listener )
	{
		this.botonComp.addActionListener(listener);
	}
	void displayErrorMessage( String errorMsg )
	{
		JOptionPane.showMessageDialog(this, errorMsg);
	}
	
	//Get y Sets
	
	public String getNombre() {
		return Nombre.getText();
		
	}

	public String getApellidos() {
		return Apellidos.getText();
	}

	public Integer getIdentificacion() {
		Integer a;
		try{
			a = Integer.parseInt(Identificacion.getText());
		}
		catch(NumberFormatException e){			
			JOptionPane.showMessageDialog(this, "Error, la identificacion debe ser un numero");
			return -1;
		}return a;
	}
	
	public int getIdBorrar() {
		return Integer.parseInt(IdBorrar.getText());
	}

	public int getEdad() {
		Integer a;
		try{
			a = Integer.parseInt(Edad.getText());
		}
		catch(NumberFormatException e){			
			JOptionPane.showMessageDialog(this, "Error, la edad debe ser un numero");
			return -1;
		}return a;
		
	}

	public int getTipo() {
		
		return Integer.parseInt((String) comboBox.getSelectedItem());
	}

	public int getTextID() {
		return Integer.parseInt(TextID.getText());
	}

	public int getTextHora() {
		return Integer.parseInt(TextHora.getText());
	}

	public int getBoxTipo() {
		return Integer.parseInt((String) BoxTipo.getSelectedItem());
	}

	public int getTextIDSalida() {
		return Integer.parseInt(TextIDSalida.getText());
	}


	public int getTextHoraSalida() {
		return Integer.parseInt(TextHoraSalida.getText());
	}

	public int getBoxTipoS(){
		return Integer.parseInt((String) BoxTipoS.getSelectedItem());
	}

}