package ar.com.educationit.buscador;

// encapsulamiento

//herencia 
public class BuscadorMusica extends Buscador {

	public BuscadorMusica(String claveBuscada) {
		//primero el hijo llama al constructor del padre
		super(claveBuscada);
	}
	
	//y
	
	//polimorfismo con redefenicion
	public Articulo[] buscar() {
		
		//busca solo en tipo libro, o sea en tipo=1
		// SELECT * FROM ARTICULO WHERE TIPO = 1 AND TITULO LIKE ''
		// CREARA SOLO OBJETOS DE LIBRO
		// dejo filo el size en 3
		
		Articulo resultado = new Musica("LUIS MIGUEL LA SERIE",915.99f, "Varios");
		
		return new Articulo[] {resultado};
	}
}
