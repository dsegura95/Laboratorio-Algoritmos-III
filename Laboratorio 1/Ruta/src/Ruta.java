
public class Ruta {
	
	static int[][] adyacen;
	
	public void roywarshall(int[][] matriz){
		int n = matriz.length;
		for (int k=0;k<n;k++) {
			for (int i=0;i<n;i++) {
				for (int j=0;j<n;j++) {
					if(matriz[i][j] == 0) {
						if (matriz[i][k]!=0 & matriz[k][j]!=0){
							if (matriz[i][k] != 0 ) {
								matriz[i][j] = k+1;
							}
						}
					}
				}
			}
		}
	}
	
	public void mostrarMatriz(int[][] a) {
		int n = a.length;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(" "+a[i][j]);
			}
		System.out.println(" ");}
	}
	
	public static void main (String[] args) {
		Grafo grafo = new Grafo();
		grafo.leer("C:\\Users\\Tecnologia\\Desktop\\KyD\\Laboratorio 1\\Ruta\\src\\facil.txt");
		adyacen = grafo.matriz_adyacencia(grafo.arreglo_relaciones);
		Ruta caminos = new Ruta();
		caminos.roywarshall(adyacen);
		caminos.mostrarMatriz(adyacen);
	}
 }
