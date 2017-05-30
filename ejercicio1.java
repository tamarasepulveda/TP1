import java.util.Scanner;

public class Persona {
	
	public static void main(String[] ar) {
		Scanner teclado= new Scanner(System.in);
		int cantidad;
		int precio;
		float abonar;
		System.out.print("Ingerese cantidad:");
		cantidad=teclado.nextInt();
		System.out.print("Ingrese precio");
		precio=teclado.nextInt();
		abonar= precio * cantidad;
		System.out.print("Se debe abonar: $ " + abonar);
	}

		
    }

	