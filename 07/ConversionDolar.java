import java.util.Scanner;
/**
 * Esta es la clase ConversionDolar que se encarga de determinar
 * cuantós dólares se puede adquirir con x cantidad de quetzales.
 * @author Adonias Pirir
 * since 2024-08-01
 */
public class ConversionDolar {
	
	/**
	*Método principal de la clase Metros_Pulgadas que se encarga de calcular 
	*la cantidad de pulgadas que se debe de pedir en base a los metros requeridos.
	*@param args que representan un listado de valores
	* 		al momento de ejecutar el programa.
	*@since 2024-08-01
	*/ 
	
		public static void main(String [] args){
			
			//Se declara la variable scan para leer datos de una linea de comandos.
			Scanner scan = new Scanner(System.in);
			//Se declara el tipo de dato double al obtener una entrada o salida con decimal
			//Entradas
			System.out.println("Ingrese la cantidad de Quetzales (GT)");		
			double Quetzales = scan.nextDouble();
			System.out.println("Ingrese el valor del dolar actualmente");
			double ValorDolar = scan.nextDouble();
			double Dolar = Quetzales / ValorDolar;
			//Salidas
			System.out.println("En dolares puede adquir la cantidad de:");
			System.out.println(Dolar);
	}
}