package cartas;
//Siempre que un programa te pida algo por teclado
import java.util.Scanner;

public class cartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de número entero
		int num;
		//Declaración de números con decimales
		double num2;
		//Declaración de palabras
		String palabra;
		//Declaración de teclado
		Scanner teclado= new Scanner(System.in);
		
		//syso+ctrl+espacio+enter
		System.out.println("Introduce un número   ");
		num=teclado.nextInt();
		System.out.println(num);

	}

}
