package Packages;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ModeloSecretaria {

	ArrayList<Funcionario> Funcionarios = new ArrayList<>();
	ArrayList<Funcionario> HistorialEntrada = new ArrayList<>();
	ArrayList<Funcionario> HistorialSalida = new ArrayList<>();
	
        public void comparador(){
        	try {
    			FileOutputStream file = new FileOutputStream("HorasTrabajadas.txt");
    			PrintWriter p = new PrintWriter(file);
    			for(int i=0; i < HistorialEntrada.size(); i++){
    				int diferencia= HistorialSalida.get(i).horadesalida - HistorialEntrada.get(i).horadeentrada;
    	            p.println("La diferencia "+ (i+1) +" es "+diferencia+" horas");
    			}
    			p.close();

    		} catch(IOException e) {
    			e.printStackTrace();
    			System.out.println("Hubo un problema leyendo");
    		}
    		
        }
        
	public ModeloSecretaria() {
		Funcionarios = Funcionario.Leer("Funcionarios.txt");
		HistorialEntrada = Funcionario.LeerRE("HistorialE.txt");
		HistorialSalida = Funcionario.LeerRS("HistorialS.txt");
	}
		
	public boolean Revisar(int id){
		System.out.print(id);
		for(int i = 0; i < Funcionarios.size(); i++){
			if(Funcionarios.get(i).ID == (id)){
				Funcionarios.remove(i);
				Funcionario.Guardar("Funcionarios.txt", Funcionarios);
				return true;
			}
		}
		return false;
		
	}
	
	public void IngresarNuevoUsuario(String nombre,String apellido, int id, int edad, int tipo){
		
		if(tipo == 1){
			Funcionarios.add(new Empleado(nombre,apellido,id,edad));
		}else{
			Funcionarios.add(new Trabajador(nombre,apellido,id,edad));
		}
		Funcionario.Guardar("Funcionarios.txt", Funcionarios);
		System.out.print(Funcionarios);
	}
	
	public ArrayList<Object[]> Agregar(){
		
		ArrayList<Object[]> X = new ArrayList<>(); 
		for(int i=0; i<Funcionarios.size();i++){
			Funcionario a = Funcionarios.get(i);
			X.add(new Object[]{a.getNombre(),a.getApellido(),a.getID(),"Funcionario","5000"});
		}
		return X;
	}
	public void IngresarEntrada(int id, int hora, int tipo){
		
		if(tipo == 1){
			HistorialEntrada.add(new Empleado(id,hora));
		}else{
			HistorialEntrada.add(new Trabajador(id,hora));
		}
		Funcionario.GuardarRegE("HistorialE.txt", HistorialEntrada);
		System.out.print(HistorialEntrada);
	}
	public ArrayList<Object[]> AgregarRegistro(){
		
		ArrayList<Object[]> E = new ArrayList<>(); 
		for(int i=0; i<HistorialEntrada.size();i++){
			Funcionario a = HistorialEntrada.get(i);
			E.add(new Object[]{a.getID(),a.getHoradeentrada(),true});
		}
		return E;
	}
	
	public void IngresarSalida(int id, int hora, int tipo){
		
		if(tipo == 1){
			HistorialSalida.add(new Empleado(id,hora,false));
		}else{
			HistorialSalida.add(new Trabajador(id,hora,false));
		}
		Funcionario.GuardarRegS("HistorialS.txt", HistorialSalida);
		System.out.print(HistorialSalida);
	}
	public ArrayList<Object[]> AgregarRegistroS(){
		
		ArrayList<Object[]> S = new ArrayList<>(); 
		for(int i=0; i<HistorialSalida.size();i++){
			Funcionario a = HistorialSalida.get(i);
			S.add(new Object[]{a.getID(),a.getHoradesalida()});
		}
		return S;
	}
	
}
