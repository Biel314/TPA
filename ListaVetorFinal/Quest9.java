import java.util.Scanner;

public class Quest9 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a[], i, j=0;
		boolean espelho=true;
		
		a = new int [10];
		 
		for (i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor: ");
			a[i] = in.nextInt();
	    }
		for(i=9; i>=0; i--) {
			if(a[i] == a[j]){
				 espelho = true;
			}else {
				 espelho = false;
				 break;
			}
			j++;
		}
		if(espelho == true) {
			System.out.println("O vetor � um pal�ndromo");
		}else {
			System.out.println("O vetor n�o � um pal�ndromo");
		}
	}
}