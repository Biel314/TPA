import java.util.Scanner;
public class VeiculoIpva {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		double pVeiculo, ipva;
		
		System.out.println("Calculador de IPVA\n");
		System.out.println("Digite o pre�o do ve�culo: ");
		pVeiculo = in.nextDouble();
		ipva = pVeiculo*4/100;
		System.out.println("O valor do IPVA de um carro que custa R$"+pVeiculo+" � de R$"+ipva);
	}
}
