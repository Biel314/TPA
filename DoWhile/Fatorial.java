import java.util.Scanner;

public class Fatorial {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int r=1, n;
		
		System.out.println("Digite o n�mero inteiro: ");
		n = in.nextInt();
		
		do{
			r=r*n;
			n--;
		}while(n>0);
		System.out.println("O fatorial do n�mero escolhido �: "+ r);
	}
}
