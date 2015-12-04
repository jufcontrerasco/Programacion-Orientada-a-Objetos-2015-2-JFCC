package Packages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class ControladorSecretaria {
	
	private VistaSecretaria theView;
	private ModeloSecretaria theModel;
	public ControladorSecretaria(VistaSecretaria theView,ModeloSecretaria theModel)
	{
		this.theView = theView;
		this.theModel = theModel;
		this.theView.botonRegEntra(new RegEntraListener());
		this.theView.botonRegsalida(new RegSalidaListener());
		this.theView.botonHisEntra(new HisEntradaListener());
		this.theView.botonHisSalida(new HisSalidaListener());
		this.theView.botonHisPago(new HisPagoListener());
		this.theView.botonNUsuario(new NuevoListener());
		this.theView.btnRegUsuario(new RegUsuarioListener());
		this.theView.botonBUsuario(new BorrarListener());
		this.theView.btnRegresarE(new RegEListener());
		this.theView.btnRegresarS(new RegSListener());
		this.theView.btnRegresarEH(new RegEHListener());
		this.theView.btnRegresarSH(new RegSHListener());
		this.theView.btnRegresarP(new RegPListener());
		this.theView.btnRegresarN(new RegNListener());
		this.theView.btnRegresarB(new RegBListener());
		this.theView.btnBorrar(new BorrarUListener());
		this.theView.RegBoton(new RegistrarEntradaListener());
		this.theView.RegBotonSalida(new RegistrarSalidaListener());
                this.theView.botonClose(new CloseListener());
                this.theView.botonComp(new CompListener());
		
		this.theView.RegBoton(new RegistroInBotonListener());

	}	
        
		public class RegEntraListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				theView.CambioRegEntra();
				
			}
		}
		public class RegSalidaListener implements ActionListener {
				
			public void actionPerformed(ActionEvent e) {
					
				theView.CambioRegSalida();
					
			}
		}
		public class HisEntradaListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
					
				theView.CambioHisEntrada();
				theView.TRegEntrada();
				theView.updateJTEntrada(theModel.AgregarRegistro());
					
			}
		}
		public class HisSalidaListener implements ActionListener {
					
					public void actionPerformed(ActionEvent e) {
							
						theView.CambioHisSalida();
						theView.TRegSalida();
						theView.updateJTSalida(theModel.AgregarRegistroS());
						
							
					}
				}
		public class HisPagoListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
					
				theView.CambioHisPago();
				theView.TRegPago();
				theView.updateJT(theModel.Agregar());
				
					
			}
		}
		public class NuevoListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
					
				theView.CambioNuevo();
					
			}
		}
		public class BorrarListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
					
				theView.CambioBorrar();
					
			}
		}
		public class RegEListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
					
				theView.Volver();
					
			}
		}
		public class RegSListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
					
				theView.Volver();
					
			}
		}
		public class RegEHListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
					
				theView.Volver();
					
			}
		}
		public class RegSHListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
					
				theView.Volver();
					
			}
		}
		public class RegPListener implements ActionListener {
					
				public void actionPerformed(ActionEvent e) {
							
					theView.Volver();
							
				}
			}
		public class RegNListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
						
				theView.Volver();
						
			}
		}
		public class RegBListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
						
				theView.Volver();
						
			}
		}
		public class RegistroInBotonListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
						
				
						
			}
		}
		public class RegUsuarioListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				int id= theView.getIdentificacion();
				if(id == -1){
					return;
				}
				int edad= theView.getEdad();
				if(edad == -1){
					return;
				}
				theModel.IngresarNuevoUsuario(theView.getNombre(), theView.getApellidos(),id,edad, theView.getTipo());
				
						
			}
		}
		public class BorrarUListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
						
				if(theModel.Revisar(theView.getIdBorrar())){
					JOptionPane.showMessageDialog(null,"Usuario borrado!");	
				}
				else{
					JOptionPane.showMessageDialog(null,"Error!,no hay Usuario asignado con esta identificacion");	
				}
						
			}
		}
		public class RegistrarEntradaListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
					
				theModel.IngresarEntrada(theView.getTextID(), theView.getTextHora(), theView.getBoxTipo());
				
					
			}
		}
		public class RegistrarSalidaListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
					
				theModel.IngresarSalida(theView.getTextIDSalida(), theView.getTextHoraSalida(), theView.getBoxTipoS());
				
					
			}
		}
                public class CloseListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {				
			
				System.exit( 0 ); 
					
			}
		}
                public class CompListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {				
			
				theModel.comparador();
			
			}
		}
		
	
}

