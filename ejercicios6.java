package proyecto;

import java.util.Scanner;

public class ejercicios6 {
private String a;
private int b;
public void ingresoDatos(){
	Scanner nombre=new Scanner(System.in);
	System.out.println("ingrese su nombre: ");
	a=nombre.next();
	Scanner sueldo=new Scanner(System.in);
	System.out.println("ingrese su sueldo: ");
	b=sueldo.nextInt();
}
public void imprimirDatos(){
	System.out.println("su nombre es: "+a);
	System.out.println("su sueldo es: "+b);
}
public void impuestossueldo(){
	if(b>3000){
		System.out.println("Usted debe pagar impuestos");
	}else{
		System.out.println("su sueldo a cobrar es:"+b);
	}
}
	 public static void main(String[] args){
		ejercicios6 empleado;
		empleado=new ejercicios6();
		empleado.ingresoDatos();
		empleado.imprimirDatos();
		empleado.impuestossueldo();
}
}
