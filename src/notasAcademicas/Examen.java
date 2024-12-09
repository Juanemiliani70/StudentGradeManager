package notasAcademicas;

public class Examen {
	private Alumno[] alumnos;
	private int notaAprobacion;
	
	public Examen(int cantidadAlumnos, int notaAprobacion) {
		this.alumnos = new Alumno[cantidadAlumnos];
		this.notaAprobacion = notaAprobacion;
	}
	
	public void listadoAlumnos() {
		for (int f = 0; f < alumnos.length; f++) {
			if (alumnos[f] != null) {
			System.out.println("Legajo:" + alumnos[f].getLegajo());
			System.out.println("Nombre:" + alumnos[f].getNombre());
			System.out.println();
			for (int c = 0; c < alumnos[f].getMaterias().length; c++) {
				System.out.println("Materia:" + alumnos[f].getMaterias()[c]);
				System.out.println("Nota:" + alumnos[f].getNotas()[c]);
				if (alumnos[f].getNotas()[c] >= notaAprobacion) {
					System.out.println("Aprobada");
				} else {
					System.out.println("Reprobada");
			    }
				System.out.println();
			}
			System.out.println("Promedio:" + alumnos[f].calcularPromedio());
			System.out.println();
		
			}
		}
	}
	
	public void materiasSuperiorPromedio() {
		for (int f = 0; f < alumnos.length; f++) {
			if (alumnos[f] != null) {
		    double promedio = alumnos[f].calcularPromedio();
		    System.out.println("Alumno:" + alumnos[f].getNombre() + " - Promedio: " + promedio);
		    System.out.println("Materias con notas superiores al promedio:");
		    for (int c = 0; c < alumnos[f].getMaterias().length; c++ ) {
			    if (alumnos[f].getNotas()[c] > promedio ) {
			    	System.out.println("Materia:" + alumnos[f].getMaterias()[c] + " - Nota: " + alumnos[f].getNotas()[c]);
				
			    }
		    }
		    System.out.println();
			
		    }
	    }
	}
	
	public void setAlumno(int i, Alumno alumno) {
		if (i >= 0 && i < alumnos.length) {
			alumnos[i] = alumno;
		}
		
	}
	
	
	
	
	

}
