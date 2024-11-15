package es.studium.pojo;

public class Principal {

	public static void main(String[] args) 
	{
			Persona persona1 = new Persona();
			persona1.setNombre("Lucía");
			persona1.setApellidos("Aroca Albarrán");
			persona1.setAula(1);
			persona1.setEdad(17);
			persona1.setHaPagado(true);
			
			Persona persona2 = new Persona("Cristina", "Mondaza Vega", 18, true, 1);
			
			System.out.println(persona1.getNombre()+" "+persona1.getApellidos()+" "+persona1.getAula()+" "+persona1.getEdad()+" "+persona1.getHaPagado());
			
			System.out.println(persona2.getNombre()+" "+persona2.getApellidos()+" "+persona2.getAula()+" "+persona2.getEdad()+" "+persona2.getHaPagado());
	}

}
