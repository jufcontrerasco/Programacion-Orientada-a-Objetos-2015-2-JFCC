package Banquitas;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido a BanquitasUN");
		System.out.println("Por favor ingrese el numero que le corresponde a la accion que desea ejecutar...");
		System.out.println("1.Agregar o Editar equipo");
		System.out.println("2.Tabla de Posiciones y Goleadores");
		System.out.println("3.Ingresar resultados de torneo");
		System.out.println("4.Numero de equipos en competicion");
		
		Scanner menu = new Scanner(System.in);	
		int men = menu.nextInt();
		ArrayList<Equipos> Final = new ArrayList<>();
		
		switch(men){
		
		case 1:
			
			int Select;
			do{
				System.out.println("Seleccione la accion\n1.Agregar Equipo \n2.Editar Equipo \n3.Eliminar Equipo");
				Select = menu.nextInt();
			}
			while(Select < 1 || Select > 3 );
			switch(Select){
			case 1:
				Equipos Equipo = new Equipos();	
				Equipo.crearEquipo();
				Equipo.agregarEquipo();
				Final.add(Equipo);
				break;

			case 2:
				
				break;
			case 3:
				
				break;

			default:
				System.out.println("Numero invalido, ingrese otro numero porfavor...");
				break;
			}
						
			break;
		
		case 2:
			
			break;
			
		case 3:
		
			break;
			
		case 4:
			
			break;
		default:
			System.out.println("Numero invalido, ingrese otro numero porfavor...");
			break;
		}
		
		 imprimir(Final);
		
	}
	
	public static void imprimir(ArrayList<Equipos> fin){
		try {
			FileOutputStream file = new FileOutputStream("jugadores.txt",true);
			PrintWriter p = new PrintWriter(file);
			
			p.println(fin.size());
			
			for(int i = 0; i < fin.size(); i++) {
				Equipos auxEquipo = fin.get(i);
				p.println(auxEquipo.nombre); /// Array List de jugadores
				p.println(auxEquipo.equipo.size()); /// Array List de jugadores
				for(int j = 0; j < auxEquipo.equipo.size(); j++) {
					Jugadores aux = auxEquipo.equipo.get(j);
					p.println(aux.nombre + " " + aux.posicion + " "+ aux.edad + " "+ aux.dorsal+ " "+ aux.goles+ " "+aux.habilidad);
				}
			}
			
			p.close();
			file.close();
			
		} catch (IOException e) {
			System.out.println("Hubo un problema escribiendo en el archivo");
		}
	}
	
	
	/*public ArrayList<Equipos> Leer (String nombre, ArrayList<Jugadores> equipo){
		try {
        	FileReader file = new FileReader("jugadores.txt");
        	BufferedReader reader = new BufferedReader(file);

        	String line;
    
        	while((line = reader.readLine()) != null) {
        		line = reader.readLine();
        		if(line == null) break;

        		String all[] = line.split(" ");
        		String name = all[0];
        		String posicion = all[1];
        		int edad = Integer.parseInt(all[2]);
        		int dorsal = Integer.parseInt(all[3]);
        		int goles = Integer.parseInt(all[4]);
        		String habilidad = all[5];
        
        		
        		Jugadores aux = new Jugadores();
        		aux.setNombre(nombre);
        		aux.setPosicion(posicion);
        		aux.setEdad(edad);
        		aux.setDorsal(dorsal);
        		aux.setGoles(goles);
        		aux.setHabilidad(habilidad);
        		
        		
        	Equipos.add(aux);
        	}
        	
        	reader.close();
        	file.close();
        	
        } catch(IOException e) {
         e.printStackTrace();
        	System.out.println("Hubo un problema leyendo");
        }
    	
        for(int i = 0; i < Jugadores.size(); i++) {
        	System.out.println(personas.get(i).id + " - " + personas.get(i).nombre);
       }
    
		return null;
		
	}*/


}