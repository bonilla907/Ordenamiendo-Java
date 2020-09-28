import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author oscar
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String frase_original= "Hola Mundo Desde Java";
        String arr_original[] = frase_original.split(" ");
        String aux[]=new String[arr_original.length];
        String direccion = "C:/Users/oscar/Desktop/prueba.txt";
        String frase;
        String oracion = "";
        String corregida = "";
        
        
        FileReader freader = new FileReader(direccion);
        BufferedReader breader = new BufferedReader(freader);
        
        if((frase=breader.readLine()) !=null){
             oracion = frase;
            System.out.println("La frase desordenada es: "+frase);
        }
        
        String partes [] = oracion.split(" ");// El metodo .Split divide un String en diferentes partes de acuerdo a un separador definido = " " , un espacio
        
        for(int i = 0; i<partes.length; i++){
            for(int j=0; j<partes.length; j++){
                if(partes[i].equals(arr_original[j])){
                    aux[j] = partes[i];
                }
            }
        }
        for(int i=0; i<aux.length; i++){
            corregida += aux[i]+" ";
            System.out.println(" "+corregida);
        }
    }   
}
