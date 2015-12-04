package Packages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class ControladorLogin {
	private VistaLogin theView;
	private ModeloLogin theModel;
	public ControladorLogin(VistaLogin theView,	ModeloLogin theModel)
	{
		this.theView = theView;
		this.theModel = theModel;
		this.theView.enviar(new EnviarListener());

	}
	public class EnviarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {


			if(theModel.Revisar(theView.getUser(), theView.getPass())){
			theView.setVisible(false);
			VistaSecretaria vs = new VistaSecretaria();
			vs.setVisible(true);
			ModeloSecretaria model = new ModeloSecretaria(); //Model.getInstance(); 
			ControladorSecretaria control = new ControladorSecretaria(vs, model);
		}
		else{
			JOptionPane.showMessageDialog(null,"Error!, el Usuario o Contrasena no son correctos");	
		}


	}
}

}
