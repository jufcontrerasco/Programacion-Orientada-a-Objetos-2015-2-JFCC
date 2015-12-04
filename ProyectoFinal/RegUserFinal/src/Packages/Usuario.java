package Packages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

	public class Usuario {
		String id;
		String password;
	
		public Usuario(String id, String password) {
			this.id = id;
			this.password = password;
			
			}	


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


		
	public void RegistroDeEntrada(Funcionario x, int horadeentrada){
		x.sethoradeentrada(horadeentrada);
	}
	public void RegistroDeSalida(Funcionario x, int horadesalida){
		x.sethoradesalida(horadesalida);
	}
	
	public void HistorialEntrada(){
		
	}
	public void HistorialSalida(){
		
	}
	public double CalcularTrabajo(Funcionario x){
		return x.horastrabajadas;
	}

	public double Pagar(Funcionario x ){
		
		return (x.salarioporhoras *  x.horastrabajadas);
		
	}

	public void HistorialPagos(){
		
	}
	
	public static ArrayList<Usuario> Leer (String fileName){
		ArrayList<Usuario> retornar = new ArrayList<>();
		try {
			File file = new File(fileName);
			Scanner leer = new Scanner(file);

			int numeroElementos = leer.nextInt();
			
			for(int i = 0; i < numeroElementos; i++) {
				String id = leer.next();
				String password = leer.next();
				retornar.add(new Usuario(id, password));
			}

			leer.close();

		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("Hubo un problema leyendo");
		}

		return retornar;

	}
	
}

