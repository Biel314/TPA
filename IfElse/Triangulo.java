import java.util.*;
public class Triangulo {
	public static void main (String args []) {
	Scanner in = new Scanner (System.in);
	
	double a, b, c;
	
	System.out.println("Escreva o primeiro valor: ");
	a = in.nextDouble();
	
	System.out.println("Escreva o segundo valor: ");
	b = in.nextDouble();
	
	System.out.println("Escreva o terceiro valor: ");
	c = in.nextDouble();
	
	if (a+b<c || a+c<b || b+c<a) {
		System.out.println("N�o � um triangulo");
		
	} else if (a==b && b==c) {
		System.out.println("Triangulo Equil�tero");
		
	} else if (a!=b && a!=c && b!=c) {
		System.out.println("Triangulo Escaleno");
	
	} else { 

		System.out.println("Triangulo Is�sceles");
		
		
		
	
		
	
	
	
		
		}
		in.close();
	}
}
