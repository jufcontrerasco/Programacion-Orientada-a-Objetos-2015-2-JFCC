package Packages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {	

	String nombre;
	String apellido;
	int ID;
	int edad;
	int fallas = 0;
	int horamaxin;
	int horaminout; 
	double numhoras;
	boolean estado;
	int horadeentrada;
	int horadesalida;
	double salarioporhoras;
	double horastrabajadas;

	
	public Funcionario() {
	
	}



	public Funcionario(String nombre, String apellido, int id, int edad, int fallas, int horamaxin,
			int horaminout, boolean estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ID = id;
		this.edad = edad;
		this.fallas = fallas;
		this.horamaxin = horamaxin;
		this.horaminout = horaminout;
		this.estado = estado;
	
	}
	
	

	public Funcionario(int iD, int horadeentrada,boolean estado) {
		this.ID = iD;
		this.horadeentrada = horadeentrada;
		this.estado = false;
	}
	
	public Funcionario(int iD, int horadesalida) {
		this.ID = iD;
		this.horadesalida = horadesalida;
	}



	public Funcionario(String nombre, String apellido, int id, int edad, int fallas, int horamaxin,
			int horaminout, boolean estado, int horadeentrada,int horadesalida,double salarioporhoras,double horastrabajadas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ID = id;
		this.edad = edad;
		this.fallas = fallas;
		this.horamaxin = horamaxin;
		this.horaminout = horaminout;
		this.estado = estado;
		this.horadeentrada = horadeentrada;
		this.horadesalida = horadesalida;
		this.salarioporhoras = salarioporhoras;
		this.horastrabajadas = horastrabajadas;
	}


	public Funcionario(String nombre, String apellido, int iD, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ID = iD;
		this.edad = edad;
		estado = false;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		this.ID = iD;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getFallas() {
		return fallas;
	}


	public void setFallas(int fallas) {
		this.fallas = fallas;
	}


	public double getHoramaxin() {
		return horamaxin;
	}


	public void setHoramaxin(int horamaxin) {
		this.horamaxin = horamaxin;
	}


	public double getHoraminout() {
		return horaminout;
	}


	public void setHoraminout(int horaminout) {
		this.horaminout = horaminout;
	}


	public double getNumhoras() {
		return numhoras;
	}


	public void setNumhoras(double numhoras) {
		this.numhoras = numhoras;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public double getHoradeentrada() {
		return horadeentrada;
	}


	public void setHoradeentrada(int horadeentrada) {
		this.horadeentrada = horadeentrada;
	}


	public double getHoradesalida() {
		return horadesalida;
	}


	public void setHoradesalida(int horadesalida) {
		this.horadesalida = horadesalida;
	}


	public double getSalarioporhoras() {
		return salarioporhoras;
	}


	public void setSalarioporhoras(double salarioporhoras) {
		this.salarioporhoras = salarioporhoras;
	}


	public double getHorastrabajadas() {
		return horastrabajadas;
	}


	public void setHorastrabajadas(double horastrabajadas) {
		this.horastrabajadas = horastrabajadas;
	}


	public void sethoradeentrada(int horaen){
		this.horadeentrada = horaen;
	}

	public double gethoradeentrada(){
		return horadeentrada;
	}

	public void sethoradesalida(int horadesal){
		this.horadesalida = horadesal;
	}

	public double gethoradesalida(){
		return horadesalida;
	}


	public void setestado(boolean estado){
		this.estado = estado;
	}

	public boolean getestado(){
		return estado;
	}

	public static void Guardar (String fileName, ArrayList<Funcionario> guardar){
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			PrintWriter p = new PrintWriter(file);

			p.println(guardar.size() + " ");
			for(int i = 0; i < guardar.size(); i++) {
				p.print(guardar.get(i).nombre + " ");
				p.print(guardar.get(i).apellido + " ");
				p.print(guardar.get(i).ID + " ");
				p.print(guardar.get(i).edad+ " ");
				p.print(guardar.get(i).fallas + " ");
				p.print(guardar.get(i).horamaxin + " ");
				p.print(guardar.get(i).horaminout + " ");
				p.println(guardar.get(i).estado + " ");
				
			}

			p.close();

		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("Hubo un problema leyendo");
		}

	}
	
	
	
	public static ArrayList<Funcionario> Leer (String fileName){
		ArrayList<Funcionario> retornar = new ArrayList<>();
		try {
			File file = new File(fileName);
			Scanner leer = new Scanner(file);

			int numeroElementos = leer.nextInt();
			
			for(int i = 0; i < numeroElementos; i++) {
				String nombre = leer.next();
				String apellido = leer.next();
				int ID = leer.nextInt();
				int edad = leer.nextInt();
				int fallas = leer.nextInt();
				int horamaxin = leer.nextInt();
				int horaminout = leer.nextInt();; 
				boolean estado = leer.nextBoolean();
				retornar.add(new Funcionario(nombre, apellido, ID, edad, fallas, horamaxin, horaminout, estado));
			}

			leer.close();

		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("Hubo un problema leyendo");
		}

		return retornar;

	}


public static void GuardarRegE (String fileName, ArrayList<Funcionario> guardar){
	try {
		FileOutputStream file = new FileOutputStream(fileName);
		PrintWriter p = new PrintWriter(file);

		p.println(guardar.size() + " ");
		for(int i = 0; i < guardar.size(); i++) {
			p.print(guardar.get(i).ID + " ");			
			p.println(guardar.get(i).horadeentrada + " ");
		}

		p.close();

	} catch(IOException e) {
		e.printStackTrace();
		System.out.println("Hubo un problema leyendo");
	}

}
public static ArrayList<Funcionario> LeerRE (String fileName){
	ArrayList<Funcionario> retornar = new ArrayList<>();
	try {
		File file = new File(fileName);
		Scanner leerR = new Scanner(file);

		int numeroElementos = leerR.nextInt();
		
		for(int i = 0; i < numeroElementos; i++) {
			int ID = leerR.nextInt();
			int horadeentrada = leerR.nextInt();
			retornar.add(new Funcionario(ID, horadeentrada,true));
		}

		leerR.close();

	} catch(IOException e) {
		e.printStackTrace();
		System.out.println("Hubo un problema leyendo");
	}

	return retornar;

}
public static void GuardarRegS (String fileName, ArrayList<Funcionario> guardar){
	try {
		FileOutputStream file = new FileOutputStream(fileName);
		PrintWriter p = new PrintWriter(file);

		p.println(guardar.size() + " ");
		for(int i = 0; i < guardar.size(); i++) {
			p.print(guardar.get(i).ID + " ");			
			p.println(guardar.get(i).horadesalida + " ");
		}

		p.close();

	} catch(IOException e) {
		e.printStackTrace();
		System.out.println("Hubo un problema leyendo");
	}

}
public static ArrayList<Funcionario> LeerRS (String fileName){
	ArrayList<Funcionario> retornar = new ArrayList<>();
	try {
		File file = new File(fileName);
		Scanner leerRS = new Scanner(file);

		int numeroElementos = leerRS.nextInt();
		
		for(int i = 0; i < numeroElementos; i++) {
			int ID = leerRS.nextInt();
			int horadesalida = leerRS.nextInt();
			retornar.add(new Funcionario(ID, horadesalida));
		}

		leerRS.close();

	} catch(IOException e) {
		e.printStackTrace();
		System.out.println("Hubo un problema leyendo");
	}

	return retornar;

}
}

class Empleado extends Funcionario {

	public Empleado(String nombre, String apellido, int iD, int edad) {
		super(nombre, apellido, iD, edad);
		horamaxin = 800;
		horaminout = 1500;
		fallas = 0;
		estado = false;
		numhoras = 7;
		salarioporhoras = 7000 ;
	}

	public Empleado(int iD, int horadeentrada) {
		this.ID = iD;
		this.horadeentrada = horadeentrada;
		
	}
	public Empleado(int iD, int horadesalida, boolean estado) {
		this.ID = iD;
		this.horadesalida = horadesalida;
		
	}
	
	
}


class Trabajador extends Funcionario {

	public Trabajador(String nombre, String apellido, int Id, int edad){
		super(nombre, apellido, Id, edad);
		horamaxin = 700;
		horaminout = 1600;
		fallas = 0;
		estado = false;
		numhoras = 9;
		salarioporhoras = 3500; 
	}

	public Trabajador(int iD, int horadeentrada) {
		this.ID = iD;
		this.horadeentrada = horadeentrada;
		
		
	}
	public Trabajador(int iD, int horadesalida, boolean estado) {
		this.ID = iD;
		this.horadesalida = horadesalida;
		
	}
	
}




