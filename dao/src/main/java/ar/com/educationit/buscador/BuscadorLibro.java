package ar.com.educationit.buscador;

// encapsulamiento

//herencia 
public class BuscadorLibro extends Buscador {

	private Integer cantTotRes;
	
	public BuscadorLibro(String claveBuscada) {
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
		
		Articulo libro1 = new Libro(super.clave, 1219f, " ROWLING, J. K.", false);
		Articulo libro2 = new Libro("HARRY POTTER Y LAS RELIQU...", 2229f, " ROWLING, J. K.", false);
		Articulo libro3 = new Libro("HARRY POTTER Y EL LEGADO MALDITO", 2390f, " ROWLING, J. K.", false);
		
		Articulo[] resultados = new Articulo[] {libro1, libro2, libro3};
		
		this.cantTotRes = resultados.length;
		
		return resultados;
	}

	public Integer getCantTotRes() {
		return cantTotRes;
	}
	
}
