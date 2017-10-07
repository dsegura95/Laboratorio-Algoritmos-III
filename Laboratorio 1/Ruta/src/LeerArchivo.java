import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo{
	
	int[][] relaciones;
	int cantidad_vertices;
	
	public LeerArchivo(String archivo){
		  try{
		      relaciones = leer_relaciones(archivo);
		      cantidad_vertices = leer_cantvertice(archivo);
		    } catch(IOException e){
		      System.err.println("Error en la lectura del archivo");
		      e.printStackTrace();
	  }
	  }

  public static int[][] leer_relaciones(String fileNameIn)
      throws IOException {
	int numero = 0,y = 0; 
	/* numero se usa para transformar el string a entero
	 * y se usa para iterar y asignar las relaciones en el
	 * arreglo tok
	 */
	String s;
    BufferedReader in = new BufferedReader(new FileReader(fileNameIn));
    String d= in.readLine();
    String z= in.readLine();
    numero = Integer.parseInt(z);
    int[][] tok = new int[numero][2];

    while ((s = in.readLine()) != null ){
    	String[] par = s.split("\\s+");
    	// Separa el string en dos caracteres
    	String q = par[0];
    	int numero1 = 0;
    	numero1 = Integer.parseInt(q);
    	String w = par[1];
    	int numero2 = 0;
    	numero2 = Integer.parseInt(w);
    	int[] nuevo = new int[2];
    	// En array nuevo se guardan los caracteres transformados en números
    	nuevo[0]=numero1;
    	nuevo[1]=numero2;
    	tok[y] = nuevo; 
    	y += 1;
    }
    in.close();
    return tok;
  }
  public static int leer_cantvertice(String archivo) throws IOException {
	  int numero2;
	  
	  BufferedReader in = new BufferedReader(new FileReader(archivo));
	  String o= in.readLine();
	  numero2 = Integer.parseInt(o);
	  in.close();
	  return numero2;
  }
  
}