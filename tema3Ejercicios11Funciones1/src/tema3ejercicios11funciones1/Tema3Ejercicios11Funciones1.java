/* Autor: Miguel Dom�nguez
 * 1.- Crear un programa que solicite al usuario que introduzca dos n�meros
enteros entre 1 y 20 (debe comprobarlo y no continuar hasta que los n�meros
introducidos sean correctos). Despu�s llamar� a una funci�n que muestre, de
mayor a menor, todos los n�meros pares que hay comprendidos entre los dos
introducidos por el usuario (estos incluidos, siempre y cuando sean pares).
*/

package tema3ejercicios11funciones1;

import java.util.Scanner;

public class Tema3Ejercicios11Funciones1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un n�mero del 1 al 20: ");
		int num1 = sc.nextInt();
		while (num1<1 || num1>20) {		//Si el n� no es correcto lo vuelve a pedir
			System.out.print("El primer n� introducido no es correcto, vuelve a introducirlo: ");
			num1 = sc.nextInt();
		}
		System.out.print("Introduce el segundo n�mero del 1 al 20: ");
		int num2 = sc.nextInt();
		while (num2<1 || num2>20) {		//Si el n� no es correcto lo vuelve a pedir
			System.out.print("El segundo n� introducido no es correcto, vuelve a introducirlo: ");
			num2 = sc.nextInt();
		}
		
		ordenaNumeros(num1, num2);		//LLamo a la funci�n que los ordena


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
		
		//Cuando ya s� cual es el mayor y el menos hago el bucle
		System.out.println("Los n�meros pares entre el "+menor+ " y el "+mayor+ " son: ");
		for (int i = menor; i<=mayor; i++) {
			//solo quiero que muestre los pares:
			if (i%2==0) {
			System.out.print(i + " ");  //Si no hay ning�n par entre ambos no mostrar� nada.
			}
		}
					
	}
}
