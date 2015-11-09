package Banquitas;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipos {
	
	String nombre;
	int gol = 0;
	ArrayList<Jugadores> equipo = new ArrayList<>();
	
	public void crearEquipo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre de su equipo...");
		String equi = sc.next();
		System.out.println("Listo!, este es el nombre de tu equipo: "+equi);		
	}
	
	public void agregarEquipo(){
		
		System.out.println("Agregar equipo:");
		System.out.println("Por favor ingrese la siguiente informacion: ");
		
		for(int id=0; id<=4;id++){
			int c = id+1;
			Scanner sc = new Scanner(System.in);
			Jugadores tmp = new Jugadores();
			System.out.println("Por favor ingrese el nombre del jugador numero "+c+" :");
			tmp.setNombre(sc.nextLine());
			System.out.println("Por favor ingrese la posicion del jugador numero "+c+" :");
			tmp.setPosicion(sc.nextLine());
			System.out.println("Por favor ingrese la edad del jugador numero "+c+" :");
			tmp.setEdad(sc.nextInt());
			System.out.println("Por favor ingrese la dorsal del jugador numero "+c+" :");
			tmp.setDorsal(sc.nextInt());
			System.out.println("Por favor ingrese la habilidad del jugador numero "+c+" :");
			tmp.setHabilidad(sc.next());
			tmp.setGoles(gol);
			System.out.println("Estos son los datos del jugador numero "+c+" :");
			tmp.mostrarJugador();
			equipo.add(tmp);
		}
	}
	
	public void agregarJugadores(){
							
		}
		
	
	
	
	
	public void mostrarEquipo(){
		System.out.println("Los jugadores de este equipo son: ");
		Jugadores tmp = new Jugadores();
		for(int id=0; id<=4;id++){			
			tmp.mostrarJugador();
		}
	}
	
	public Equipos(String nombre, ArrayList<Jugadores> equipo){
			this.nombre = nombre;
			this.equipo = equipo;
	}
	public Equipos(){
}
	
}
