/** TAD Vertice
 * 
 * Clase que se encarga de crear los vértices que constituirán los grafos.
 */

public class Vertice
{
	// Atributos que almacenarán el identificador del vertice y su peso asociado.
  private String id;
  private double peso;
  
  public Vertice(String id, double peso) {
	  // Constructor de la clase Vertice
  	this.id = id;
  	this.peso = peso;
  	}

  public double getPeso() {
	  // Método que devolverá el peso del vértice
	  return this.peso;
  }

  public String getId() {
	  // Método que devolverá el id del vértice
	  return this.id;
  }

  public String toString() {
	  // Método que proporciona una representación del vértice como cadena de carácteres
	  String peso_string = String.valueOf(this.peso); 
	  String cadena = "Vertice "+this.id+" de peso "+peso_string;
	  return cadena;
  }
}