

public class Libros {

	//Atributos
	
	private String titulo,autor;
	private int ejemplares;
	
	private int ejemplaresTotales;
    private boolean prestamo = false;
	
	//Métodos 
	
	public Libros (String titulo, String autor, int ejemplares) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		
		ejemplaresTotales = ejemplares;
		
	}
	
	public void prestamo (int prest) {
		
		if (ejemplares >0 && ejemplaresTotales<=prest ) { 
			
			ejemplares = ejemplares-ejemplaresTotales;
			
			System.out.println("Se han llevado " + prest + " ejemplares, quedan "+ejemplares);
			
			if (ejemplares!=ejemplaresTotales) {
				
				prestamo=true;
				
			}
		
		
	}
		else {
			
			System.out.println("No hay existencias");
			
		}
		
		
	}	
	
	public void exitenLibroPrestados() {
		
		if (prestamo) {
			
			System.out.println("Sí, hay "+ejemplares+" prestados de " +titulo );
			
		}
		
		else {
			
			System.out.println("Todos los ejemplares de "+titulo+" se encuentran en la biblioteca");
		}
		
	}
	
	public void devolucion (int devol) {
		
		if (prestamo==true && devol<=ejemplaresTotales) {
			
			ejemplares = +devol;
			
			if (ejemplares == ejemplaresTotales) {
				
				System.out.print("Todos los ejemplares han sido devueltos");
				
				prestamo=false;
			}
			
		}
		else
		{
			System.out.println("Todos los ejemplares se encuentran en la biblioteca");
		}
		
	
		
	}
	
	
	
	public String toString () {
		
		String mensaje = "El libro " + titulo + " del autor " + autor + " tiene actualmente " + ejemplares + " ejemplares";
		
		return mensaje;
	}
}
