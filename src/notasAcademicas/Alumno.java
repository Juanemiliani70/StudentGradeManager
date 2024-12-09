package notasAcademicas;

public class Alumno {
	private int legajo;
	private String nombre;
	private String[] materias;
	private int[] notas;
	
	public Alumno(int legajo, String nombre, String[] materias) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.materias = materias;
		this.notas = new int[materias.length];
		
	}
	
	
	public int getLegajo() {
		return legajo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String[] getMaterias() {
		return materias;
	}
	
	public int[] getNotas() {
		return notas;
	}
	
	public void setNota(int i, int nota) {
		if (i >= 0 && i < notas.length) {
			this.notas[i] = nota;
			
		}
		
	}
	
	public double calcularPromedio() {
		int suma = 0;
		for (int f = 0; f < materias.length; f++) {
			suma = suma + notas[f];
		}
		return (double) suma/materias.length;
	}
	
}

	
	


