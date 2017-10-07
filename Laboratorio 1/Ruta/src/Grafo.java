
public class Grafo {
	int [][] arreglo_relaciones,adyacencia;
	int num_vertices;
	
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
			adyacencia[vertice1][vertice2] = 1;
			}
		return adyacencia;
		}       
	
	public static void main(String[] args) {
		int[][] hg;
		
		Grafo h = new Grafo();
		h.leer("C:\\Users\\Tecnologia\\Desktop\\KyD\\Ruta\\src\\facil.txt");
		hg = h.matriz_adyacencia(h.arreglo_relaciones);
		for (int x=0; x < hg.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < hg[x].length; y++) {
			    System.out.print (hg[x][y]);
			    if (y!=hg[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
	}
}
