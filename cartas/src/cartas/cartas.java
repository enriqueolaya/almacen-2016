package cartas;
//Siempre que un programa te pida algo por teclado
import java.util.Scanner;

public class cartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaraci�n de n�mero entero
		int num;
		//Declaraci�n de n�meros con decimales
		double num2;
		//Declaraci�n de palabras
		String palabra;
		//Declaraci�n de teclado
		Scanner teclado= new Scanner(System.in);
		
		//syso+ctrl+espacio+enter
		System.out.println("Introduce un n�mero   ");
		num=teclado.nextInt();
		System.out.println(num);

	}

}
