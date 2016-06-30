package App_Alumnos;

public class Informacion extends Alumnos{

	public Informacion(String numero_matricula, String nombres, String genero, double nota_tparciales,
			double nota_examen) {
		super(numero_matricula, nombres, genero, nota_tparciales, nota_examen);
		
	}
	
	public void show_inf(){
		System.out.println("MATRICULA->"+getNumero_matricula()+" | NOMRES->"+getNombre()+" | MATERIA->"+getGenero()+" | NOTA PARCIALES->"+String.valueOf(nota_tparciales)+" | NOTA EXAMEN->"+String.valueOf(nota_examen));
	}

}
