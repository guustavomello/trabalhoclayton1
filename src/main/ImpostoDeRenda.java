package main;
import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Entrada dos dados de renda anual
	        System.out.print("Informe a renda anual proveniente de salário: ");
	        double rendaSalarioAnual = scanner.nextDouble();
	        System.out.print("Informe a renda anual proveniente de prestação de serviço: ");
	        double rendaServicoAnual = scanner.nextDouble();
	        System.out.print("Informe a renda anual proveniente de ganho de capital: ");
	        double rendaCapitalAnual = scanner.nextDouble();
	        
	        // Entrada dos gastos dedutíveis
	        System.out.print("Informe os gastos médicos anuais: ");
	        double gastosMedicos = scanner.nextDouble();
	        System.out.print("Informe os gastos educacionais anuais: ");
	        double gastosEducacionais = scanner.nextDouble();

	        // Cálculo do imposto sobre salário
	        double salarioMensal = rendaSalarioAnual / 12;
	        double impostoSalario = 0;

	        if (salarioMensal >= 5000) {
	            impostoSalario = rendaSalarioAnual * 0.20;
	        } else if (salarioMensal >= 3000) {
	            impostoSalario = rendaSalarioAnual * 0.10;
	        }

	        // Cálculo do imposto sobre outras rendas (serviços e capital)
	        double impostoServico = rendaServicoAnual * 0.15; // Alíquota de 15% para prestação de serviço
	        double impostoCapital = rendaCapitalAnual * 0.20; // Alíquota de 20% para ganho de capital

	        // Total de imposto bruto
	        double impostoBruto = impostoSalario + impostoServico + impostoCapital;

	        // Deduções permitidas
	        double totalDeducoes = gastosMedicos + gastosEducacionais;

	        // Cálculo do imposto líquido
	        double impostoLiquido = impostoBruto - totalDeducoes;

	        // Imposto não pode ser negativo
	        if (impostoLiquido < 0) {
	            impostoLiquido = 0;
	        }

	        // Saída do relatório
	        System.out.println("\n--- Relatório de Imposto de Renda ---");
	        System.out.printf("Imposto sobre salário: R$ %.2f%n", impostoSalario);
	        System.out.printf("Imposto sobre prestação de serviço: R$ %.2f%n", impostoServico);
	        System.out.printf("Imposto sobre ganho de capital: R$ %.2f%n", impostoCapital);
	        System.out.printf("Total de deduções: R$ %.2f%n", totalDeducoes);
	        System.out.printf("Imposto bruto total: R$ %.2f%n", impostoBruto);
	        System.out.printf("Imposto líquido a pagar: R$ %.2f%n", impostoLiquido);

	        scanner.close();
	}

}
