/** TAD Vertice
 * 
 * Clase que se encarga de crear los v�rtices que constituir�n los grafos.
 */

public class Vertice
{
	// Atributos que almacenar�n el identificador del vertice y su peso asociado.
  private String id;
  private double peso;
  
  public Vertice(String id, double peso) {
	  // Constructor de la clase Vertice
  	this.id = id;
  	this.peso = peso;
  	}

  public double getPeso() {
	  // M�todo que devolver� el peso del v�rtice
	  return this.peso;
  }

  public String getId() {
	  // M�todo que devolver� el id del v�rtice
	  return this.id;
  }

  public String toString() {
	  // M�todo que proporciona una representaci�n del v�rtice como cadena de car�cteres
	  String peso_string = String.valueOf(this.peso); 
	  String cadena = "Vertice "+this.id+" de peso "+peso_string;
	  return cadena;
  }
}