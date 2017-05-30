package proyecto;

import java.util.Scanner;
public class ejercicios {
	
	private Scanner teclado;
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int numero;
		int i=0;
		while (i<1999){
			System.out.println("ingrese un numero:");
			numero=teclado.nextInt();
			if(numero==0){
				System.out.println("el numero ingresado es 0");
			} else if (numero>0){
				System.out.println("el numero ingresado es mayor a 0");
			}else{
				System.out.println("el numero ingresado es menor a 0");
			}
			i=i+numero;
			if (i>=9999){
				System.out.println("el resultado es  "+i);
			}
		}
	}

}
