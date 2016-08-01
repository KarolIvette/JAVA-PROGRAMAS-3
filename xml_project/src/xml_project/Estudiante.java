package xml_project;

public class Estudiante {
	
	private String matricula;
	private String nombres;
	private double notas_parciales;
	private double notas_examen;
	
	public Estudiante(){}
	public Estudiante(String matricula, String nombres, double notas_parciales, double notas_examen){
		this.matricula= matricula;
		this.nombres = nombres;
		this.notas_examen = notas_examen;
		this.notas_parciales = notas_parciales;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public double getNotas_parciales() {
		return notas_parciales;
	}
	public void setNotas_parciales(double notas_parciales) {
		this.notas_parciales = notas_parciales;
	}
	public double getNotas_examen() {
		return notas_examen;
	}
	public void setNotas_examen(double notas_examen) {
		this.notas_examen = notas_examen;
	}

}
