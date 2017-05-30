package ejer4;
public class actividad4 {
	private int total;
	private int i;
	public void tablaCinco(){
		for(i=0; i<=10 ; i++ ){
			total=5*i;
			System.out.println("5 * "+i+" = "+total);
		}
	}
	public static void main(String[] a) {
		actividad4 x;
		x=new actividad4();
		x.tablaCinco();
		
		
	}
}