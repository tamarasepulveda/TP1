package proyecto;

import java.util.Scanner;

public class ejercicio7 {
	private int n1;
	private int n2;
	private int suma;
	private int multi;
	private int divi;
	private int resta;
	
	private void ingresovalor(){
		Scanner valor=new Scanner(System.in);
		System.out.println("ingrese un valor: ");
		n1=valor.nextInt();
		Scanner valor2=new Scanner(System.in);
		System.out.println("ingrese otro valor: ");
		n2=valor2.nextInt();
}
	public void operacionSuma(){
		suma=n1+n2;
		System.out.println("la suma de los numeros es: "+suma);
}
	public void operacionMulti(){
		multi=n1*n2;
		System.out.println("la multiplicacion de los numeros es: "+multi);
}
	public void operacionDivi(){
		divi=n1/n2;
		System.out.println("la division de los numeros es: "+divi);
}
		public void operacionResta(){
			resta=n1-n2;
			System.out.println("la resta de los numeros es: "+resta);
}
		public static void main (String [] args){
	}
}
