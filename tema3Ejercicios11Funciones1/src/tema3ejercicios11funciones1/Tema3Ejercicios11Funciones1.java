/* Autor: Miguel Domínguez
 * 1.- Crear un programa que solicite al usuario que introduzca dos números
enteros entre 1 y 20 (debe comprobarlo y no continuar hasta que los números
introducidos sean correctos). Después llamará a una función que muestre, de
mayor a menor, todos los números pares que hay comprendidos entre los dos
introducidos por el usuario (estos incluidos, siempre y cuando sean pares).
*/

package tema3ejercicios11funciones1;

import java.util.Scanner;

public class Tema3Ejercicios11Funciones1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número del 1 al 20: ");
		int num1 = sc.nextInt();
		while (num1<1 || num1>20) {		//Si el nº no es correcto lo vuelve a pedir
			System.out.print("El primer nº introducido no es correcto, vuelve a introducirlo: ");
			num1 = sc.nextInt();
		}
		System.out.print("Introduce el segundo número del 1 al 20: ");
		int num2 = sc.nextInt();
		while (num2<1 || num2>20) {		//Si el nº no es correcto lo vuelve a pedir
			System.out.print("El segundo nº introducido no es correcto, vuelve a introducirlo: ");
			num2 = sc.nextInt();
		}
		
		ordenaNumeros(num1, num2);		//LLamo a la función que los ordena


		sc.close();
	}
	
	static void ordenaNumeros (int num1, int num2) {	//void -->solo devuelve texto
		//Miro miro cual es le menor
		int menor, mayor;
		if (num1<num2) { 	
			menor=num1;		//guardo cual es mayor o menos para luego hacer el for
			mayor=num2;			
		}
		else {
			menor=num2;
			mayor=num1;
		}
		
		//Cuando ya sé cual es el mayor y el menos hago el bucle
		System.out.println("Los números pares entre el "+menor+ " y el "+mayor+ " son: ");
		for (int i = menor; i<=mayor; i++) {
			//solo quiero que muestre los pares:
			if (i%2==0) {
			System.out.print(i + " ");  //Si no hay ningún par entre ambos no mostrará nada.
			}
		}
					
	}
}
