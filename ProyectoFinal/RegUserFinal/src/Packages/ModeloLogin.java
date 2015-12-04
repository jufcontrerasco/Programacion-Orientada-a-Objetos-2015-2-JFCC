package Packages;

import java.util.ArrayList;

public class ModeloLogin {
	
	ArrayList<Usuario>Usuarios = Usuario.Leer("Usuarios.txt");
	
	public boolean Revisar(String nombre, String pass){
		
		for(int i = 0; i < Usuarios.size(); i++){
			if(Usuarios.get(i).id.equals(nombre) && Usuarios.get(i).password.equals(pass)){
				return true;
			}
		}
		return false;
		
	}
}
