import java.util.Scanner;

public class Digitos {
	public static void main(String[] ar) {
		Scanner teclado= new Scanner(System.in);
		int numero;
		System.out.println("Ingrese numero: ");
		numero=teclado.nextInt();
		if( numero<10){
			System.out.print( numero +" Tiene Un Digito");
			}
	    else if(numero<100){
	        System.out.print( numero+" Tiene Dos Digitos");
	        }
	    else{
	    	System.out.print( numero +" Tiene Mas de Dos Digitos");
	    }
}
}