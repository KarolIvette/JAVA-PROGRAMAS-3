package App_Alumnos;

public interface Datos {
	
	void setNumero_matricula(String numero_matricula);
	String getNumero_matricula();
	void setNombre(String nombres);
	String getNombre();
	void setGenero(String genero);
	String getGenero();
	void setNota_tparciales(int nota_tparciales);
	double getNota_tparciales();
	void setNota_examen(int examen);
	double getNota_examen();
	
}
