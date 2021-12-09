package MainApp;
import Banca.Persona;

import java.util.ArrayList;
import java.util.Scanner;

import Banca.CuentaCorriente;

public class mainapp {
	public static void main(String[] args) {
    ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
    Scanner sc = new Scanner(System.in);
    String opc = "";
    int i = 1;
    CuentaCorriente Cuenta = null;
    double sueldo = ((Math.random() * 1000) + 100);
    String dni;
    String nombre;
    String apellidos;
    
    Persona persona1 = new Persona("Ana", "Fuentes", "75921870C", sueldo, Cuenta);
    Persona persona2 = new Persona("Andrey", "Maza", "79876755C", sueldo, Cuenta);
    Persona persona3 = new Persona("José", "López", "76554437W", sueldo, Cuenta);
    do {
    	System.out.println("1. Añadir persona.");
    	System.out.println("2. Listar personas.");
    	System.out.println("3. Seleccionar persona.");
    	System.out.println("0. Salir.");
    	opc = sc.nextLine();
    	
    	switch (opc) {
    	
    	//Recogemos datos de la persona.
    	case"1":
    		System.out.println("Nombre:  ");
    		nombre = sc.nextLine();
    		System.out.println("Apellidos:  ");
    		apellidos = sc.nextLine();
    		System.out.println("DNI:  ");
    		dni = sc.nextLine();
    		System.out.println("Persona añadida.");
 
    		
    		
    		
    	//Se crea la persona con sus datos y es añadida en el array.
    		listaPersonas.add(new Persona(nombre, apellidos, dni, sueldo, Cuenta));
    		break;
    		
    	case"2":
    		i = 1;
    		for (Persona p : listaPersonas) {
    			System.out.println(i + ". "+ p);
    			i++;
    			
    		}
    	   break;
    	case"3":
    		i=1;
    		for (Persona p : listaPersonas) {
    			System.out.println(i + ". " + p);
    			i++;
    		}
    		System.out.println("Introduce los datos de una de las personas de la lista para seleccionarla:  ");
            int indiceLista = Integer.parseInt(sc.nextLine());
            if (indiceLista <= listaPersonas.size()); {
            	Persona seleccionada = listaPersonas.get(indiceLista - 1);
            	System.out.println(seleccionada);
            }else {
            System.out.println("La persona no está en la lista. :(");
            
        }
            break;
    	case "0":
    		System.exit(0);
    		break;
    	    }
    	
    }while (opc.equals(1) || opc.equals(2)|| opc.equals(3) || opc.equals(0));
 }
 

	}
