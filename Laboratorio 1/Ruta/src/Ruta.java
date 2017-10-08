import java.util.ArrayList;
import java.util.Iterator;

public class Ruta {
	
	static int[][] adyacen;
	ArrayList<String> camino = new ArrayList<String>();
	private Iterator<String> iter;
	
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
	
	public void flavianni(String inicio, String fin) {
		int numeroi = Integer.parseInt(inicio);
		int numerof = Integer.parseInt(fin);
		camino.add(inicio);
		if (adyacen[numeroi][numerof] == adyacen.length + 2) {
			camino.add(fin);
			iter = camino.iterator();
			while (iter.hasNext()) {
				String elemento = iter.next();
				System.out.print(elemento+" ");
			}
			
		}
		else if(adyacen[numeroi][numerof] == 0) {
			System.out.println("No hay ruta entre los dos puntos");
		}
		else {
			String cadena = String.valueOf(adyacen[numeroi][numerof]-1);
			flavianni(cadena,fin);
		}
	}
	
	public static void main (String[] args) {
		Grafo grafo = new Grafo();
		grafo.leer(args[0]);
		adyacen = grafo.matriz_adyacencia(grafo.arreglo_relaciones);
		Ruta caminos = new Ruta();
		caminos.roywarshall(adyacen);
		caminos.flavianni(args[1],args[2]);
	}
 }
