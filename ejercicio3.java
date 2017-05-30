import java.util.Scanner;

public class ParImpar {
	public static void main(String[] ar) {
		Scanner teclado= new Scanner(System.in);
		int numero;
		int pares=0;
		int impares=0;
		int x=0;
				while (x<=10){
		System.out.println("Ingrese numero: ");
		numero=teclado.nextInt();
		if (numero%2==0){
			pares=pares+1;
	    }else {
	    	impares=impares+1;
	    }
		x=x+1;
				}
		System.out.println("Los pares son: "+pares);
		System.out.println("Los Impares son: "+impares);
}
}