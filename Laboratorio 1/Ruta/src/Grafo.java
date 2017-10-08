
public class Grafo {
	int [][] arreglo_relaciones,adyacencia;
	int num_vertices;
	
	public Grafo(){
	}
	
	public void leer(String Archivo){
		LeerArchivo b = new LeerArchivo(Archivo);
		arreglo_relaciones = b.relaciones;
		num_vertices = b.cantidad_vertices;
	}
	
	public int[][] matriz_adyacencia(int[][] relaciones){
		int i,vertice1,vertice2;
		adyacencia = new int[this.num_vertices][this.num_vertices];
		for (i=0;i<this.arreglo_relaciones.length;i++) {
			vertice1 = arreglo_relaciones[i][0];
			vertice2 = arreglo_relaciones[i][1];
			adyacencia[vertice1][vertice2] = this.num_vertices + 2;
			}
		return adyacencia;
		}       
}
