
public class MainLibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libros antropologia1 = new Libros("Sapiens", "Yuval Noah", 15);
		Libros basuraLiteraria1= new Libros("Ambiciones y reflexiones", "Belén Esteban", 10);
		
	
		 // Muestra el estado de los libros a traves de un método útil
		estadoLibro(antropologia1);
		estadoLibro(basuraLiteraria1);
		
		// nos llevamos prestados todos los libros de antropología
		
		antropologia1.prestamo(15);
	
		// Ahora muestra el estado a cero
		
		estadoLibro(antropologia1);
		
		// Volvemos a tratar de llevarnos 15 libros, el método de su clase evita que sean -15 y avisa que no hay existencias
		
		antropologia1.prestamo(15);
		
		// Comprobamos nuevamente el estado y aseguramos que efectivamente la existencias están a cero aun
		
		estadoLibro(antropologia1);
		
		basuraLiteraria1.exitenLibroPrestados();
		
		
		}
	
  public static Libros estadoLibro(Libros libro) {
	
	  System.out.println(libro.toString());
	  return libro;
	  
}

}
