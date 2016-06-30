package App_Alumnos;

public class Alumnos implements Datos{
	
	private String numero_matricula;
	private String nombres;
	private String genero;
	protected double nota_tparciales;
	protected double nota_examen;
	
	public Alumnos( String numero_matricula, String nombres, String genero, double nota_tparciales, double nota_examen) {
		this.numero_matricula = numero_matricula;
    	this.nombres = nombres;
    	this.genero = genero;
    	this.nota_tparciales = nota_tparciales;
    	this.nota_examen = nota_examen;
	}
	
	@Override
	public void setNumero_matricula(String numero_matricula) {
		this.numero_matricula = numero_matricula;
		
	}
	
	@Override
	public String getNumero_matricula() {
		return numero_matricula;
	}
	
	@Override
	public void setNombre(String nombres) {
		this.nombres = nombres;
		
	}
	
	@Override
	public String getNombre() {
		return nombres;
	}
	
	@Override
	public void setGenero(String genero) {
		this.genero = genero;
		
	}
	
	@Override
	public String getGenero() {
		// TODO Auto-generated method stub
		return genero;
	}
	
	@Override
	public void setNota_tparciales(int nota_tparciales) {
		this.nota_tparciales = nota_tparciales;
		
	}
	
	@Override
	public double getNota_tparciales() {
		// TODO Auto-generated method stub
		return nota_tparciales;
	}
	
	@Override
	public void setNota_examen(int nota_examen) {
		this.nota_examen = nota_examen;
		
	}
	
	@Override
	public double getNota_examen() {
		// TODO Auto-generated method stub
		return nota_examen;
	}

}
