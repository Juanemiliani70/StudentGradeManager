package notasAcademicas;

import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Examen examen = new Examen(2, 7);
		
		String[] materias = {"Matematica", "Historia", "Geografia"};
		
		Alumno alumno1 = new Alumno(1, "Juan Perez", materias);
		alumno1.setNota(0, 8);
		alumno1.setNota(1, 7);
		alumno1.setNota(2, 9);
		
		Alumno alumno2 = new Alumno(2, "Pedro Barrios", materias);
		alumno2.setNota(0, 5);
		alumno2.setNota(1, 6);
		alumno2.setNota(2, 8);
		
		examen.setAlumno(0, alumno1);
		examen.setAlumno(1, alumno2);
		
		int opcion;
		do {
			System.out.println("Menu de opciones:");
			System.out.println("1. Lista Alumnos y Notas");
			System.out.println("2. Materias con notas superiores al promedio");
			System.out.println("3. Salir");
			System.out.print("Seleccione una opcion: ");
			opcion = scanner.nextInt();
			System.out.println();
			
			switch (opcion) {
			    case 1:
			    	examen.listadoAlumnos();
			    	break;
			    case 2:
			    	examen.materiasSuperiorPromedio();
			    	break;
			    case 3:
			    	System.out.println("saliendo...");
			    	break;
			    default:
			    	System.out.println("Opcion no valida. intente nuevamente");
			}
			System.out.println();
		} while (opcion != 3);
		
		scanner.close();
	}

}
